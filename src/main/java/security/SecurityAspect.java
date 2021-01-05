package security;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import enums.Role;
import io.jsonwebtoken.Claims;

@Aspect
@Configuration
public class SecurityAspect {
	@Value("${oauth.jwt.secret}")
    private String jwtSecret;

    private TokenService tokenService;

    public SecurityAspect(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @Around("@annotation(security.CheckSecurity)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        Long methodId = null;
        Claims claims = null;

        for (int i = 0; i < methodSignature.getParameterNames().length; i++) {
            if (methodSignature.getParameterNames()[i].equals("authorization")) {
            	claims = tokenService.parseToken(joinPoint.getArgs()[i].toString());
            }
            if (methodSignature.getParameterNames()[i].equals("id")) {
            	if(methodId == null && joinPoint.getArgs()[i] instanceof Long) {
            		methodId = (Long)joinPoint.getArgs()[i];
            	}
            }
        }
        
		Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Niste ulogovani.");
        
        if (claims == null) {
            return new ResponseEntity<>(body, HttpStatus.UNAUTHORIZED);
        }

        CheckSecurity checkSecurity = method.getAnnotation(CheckSecurity.class);

        String roleString = claims.get("role", String.class);
        Role role = Role.valueOf(roleString);
        if (Arrays.asList(checkSecurity.roles()).contains(role)) {
        	if(!role.getGlobalPermissions() && checkSecurity.checkOwnership()) {
        		Long id = claims.get("id", Long.class);
        		if(id.equals(methodId)) {
        			return joinPoint.proceed();
        		}
        	} 
        	else {
                return joinPoint.proceed();
        	}
        }

        body.put("message", "Nemate dozvolu za ovo.");
        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
}

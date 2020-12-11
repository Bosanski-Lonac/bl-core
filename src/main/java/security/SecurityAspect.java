package security;

import java.lang.reflect.Method;
import java.util.Arrays;

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

        String methodId = null;
        String token = null;

        for (int i = 0; i < methodSignature.getParameterNames().length; i++) {
            if (methodSignature.getParameterNames()[i].equals("authorization")) {
                if (joinPoint.getArgs()[i].toString().startsWith("Bearer")) {
                    token = joinPoint.getArgs()[i].toString().split(" ")[1];
                }
            }
            if (methodSignature.getParameterNames()[i].equals("id")) {
            	methodId = joinPoint.getArgs()[i].toString();
            }
        }

        if (token == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        Claims claims = tokenService.parseToken(token);
        if (claims == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        CheckSecurity checkSecurity = method.getAnnotation(CheckSecurity.class);

        String roleString = claims.get("role", String.class);
        Role role = Role.valueOf(roleString);
        if (Arrays.asList(checkSecurity.roles()).contains(role)) {
        	if(!role.getGlobalPermissions() && checkSecurity.ownerOnly()) {
        		String id = claims.get("id", String.class);
        		if(id.equals(methodId)) {
        			return joinPoint.proceed();
        		}
        	} 
        	else {
                return joinPoint.proceed();
        	}
        }

        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
}

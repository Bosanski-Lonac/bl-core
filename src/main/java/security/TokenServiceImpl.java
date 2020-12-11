package security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenServiceImpl implements TokenService {
	
	@Value("${oauth.jwt.secret}")
    private String jwtSecret;
	
	@Override
	public String generate(Claims claims) {
		return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
	}

	@Override
	public Claims parseToken(String authorization) {
		Claims claims = null;
		String jwt;
        try {
        	if(authorization.startsWith("Bearer")) {
        		jwt = authorization.split(" ")[1];
                claims = Jwts.parser()
                        .setSigningKey(jwtSecret)
                        .parseClaimsJws(jwt)
                        .getBody();
        	}
        } catch (Exception e) {
        }
        return claims;
	}

}

package security;

import org.springframework.stereotype.Service;

import dto.TokenResponseDto;
import enums.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenServiceImpl implements TokenService {
	
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

	@Override
	public Long getIdFromToken(String authorization) {
		Claims claims = parseToken(authorization);
		return claims.get("id", Long.class);
	}

	@Override
	public void setSecret(String jwtSecret) {
		this.jwtSecret = jwtSecret;
	}

	@Override
	public TokenResponseDto createToken(Long id, Role role) {
		Claims claims = Jwts.claims();
		claims.put("id", id);
		claims.put("role", role.toString());
		return new TokenResponseDto(generate(claims), id);
	}

}

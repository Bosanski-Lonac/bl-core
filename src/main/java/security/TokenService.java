package security;

import io.jsonwebtoken.Claims;

public interface TokenService {
	String generate(Claims claims);
    Claims parseToken(String authorization);
}

package security;

import dto.TokenResponseDto;
import enums.Role;
import io.jsonwebtoken.Claims;

public interface TokenService {
	TokenResponseDto createToken(Long id, Role role);
	String generate(Claims claims);
    Claims parseToken(String authorization);
    Long getIdFromToken(String authorization);
    void setSecret(String jwtSecret);
}

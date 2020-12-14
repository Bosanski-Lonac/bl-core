package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TokenResponseDto {
	@NotBlank
    private String token;
	@NotNull
	private Long id;
	
	public TokenResponseDto() {
		
	}

    public TokenResponseDto(String token, Long id) {
        this.token = token;
        this.id = id;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

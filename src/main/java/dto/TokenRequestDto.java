package dto;

import javax.validation.constraints.NotBlank;

public class TokenRequestDto {
	@NotBlank(message = "Niste prosledili korisničko ime")
	private String username;
	@NotBlank(message = "Niste prosledili šifru")
    private String password;

    public TokenRequestDto() {
    }

    public TokenRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

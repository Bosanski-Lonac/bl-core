package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TokenResponseDto {
	@NotBlank
    private String token;
	@NotNull
	private KorisnikDto korisnikDto;
	
	public TokenResponseDto() {
		
	}

    public TokenResponseDto(String token, KorisnikDto korisnikDto) {
        this.token = token;
        this.korisnikDto = korisnikDto;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public KorisnikDto getKorisnikDto() {
		return korisnikDto;
	}

	public void setKorisnikDto(KorisnikDto korisnikDto) {
		this.korisnikDto = korisnikDto;
	}
}

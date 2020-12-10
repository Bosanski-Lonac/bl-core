package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AdminDto {
	@NotBlank
	private String username;
	@Size(min = 5, message = "Sifra mora da bude bar 5 karaktera")
	private String sifra;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
}

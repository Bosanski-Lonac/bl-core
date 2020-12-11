package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AdminDto {
	@NotBlank
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}

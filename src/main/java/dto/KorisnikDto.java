package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import enums.Rank;
import enums.Role;

public class KorisnikDto {
	@NotNull
	private Long id;
	@NotBlank
	private String username;
	@NotNull
	private Role role;
	private String ime;
	private String prezime;
	private String brojPasosa;
	private Integer milje;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBrojPasosa() {
		return brojPasosa;
	}
	public void setBrojPasosa(String brojPasosa) {
		this.brojPasosa = brojPasosa;
	}
	public Integer getMilje() {
		return milje;
	}
	public void setMilje(Integer milje) {
		this.milje = milje;
	}
	public Rank odrediRank() {
		return Rank.getRankForMilje(milje);
	}
}

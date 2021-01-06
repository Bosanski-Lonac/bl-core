package dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class KorisnikUpdateDto {
	@Email(message = "Mora biti validan email")
	private String email;
	@NotBlank(message = "Morate ukucati trenutnu šifru")
	private String sifra;
	@NotNull
	private String novaSifra;
	@NotBlank(message = "Ime ne moze ostati prazno")
	private String ime;
	@NotBlank(message = "Prezime ne moze ostati prazno")
	private String prezime;
	@Size(min = 9, max = 9, message = "Broj pasosa je uvek 9 karaktera")
	private String brojPasosa;

	public KorisnikUpdateDto() {
		
	}
	
	public KorisnikUpdateDto(@Email(message = "Mora biti validan email") String email,
			@NotBlank(message = "Morate ukucati trenutnu sifru") String sifra, String novaSifra,
			@NotBlank(message = "Ime ne moze ostati prazno") String ime,
			@NotBlank(message = "Prezime ne moze ostati prazno") String prezime,
			@Size(min = 9, max = 9, message = "Broj pasosa je uvek 9 karaktera") String brojPasosa) {
		super();
		this.email = email;
		this.sifra = sifra;
		this.novaSifra = novaSifra;
		this.ime = ime;
		this.prezime = prezime;
		this.brojPasosa = brojPasosa;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	
	public String getNovaSifra() {
		return novaSifra;
	}

	public void setNovaSifra(String novaSifra) {
		this.novaSifra = novaSifra;
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
}

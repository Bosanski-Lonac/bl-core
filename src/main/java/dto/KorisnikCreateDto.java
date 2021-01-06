package dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class KorisnikCreateDto {
	@Email(message = "Mora biti validan email")
	private String email;
	@Size(min = 5, message = "Sifra mora da bude bar 5 karaktera")
	private String sifra;
	@NotBlank(message = "Ime ne moze ostati prazno")
	private String ime;
	@NotBlank(message = "Prezime ne moze ostati prazno")
	private String prezime;
	@Size(min = 9, max = 9, message = "Broj pasosa je uvek 9 karaktera")
	private String brojPasosa;
	
	public KorisnikCreateDto() {
		
	}
	
	public KorisnikCreateDto(@Email(message = "Mora biti validan email") String email,
			@Size(min = 5, message = "Sifra mora da bude bar 5 karaktera") String sifra,
			@NotBlank(message = "Ime ne moze ostati prazno") String ime,
			@NotBlank(message = "Prezime ne moze ostati prazno") String prezime,
			@Size(min = 9, max = 9, message = "Broj pasosa je uvek 9 karaktera") String brojPasosa) {
		super();
		this.email = email;
		this.sifra = sifra;
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

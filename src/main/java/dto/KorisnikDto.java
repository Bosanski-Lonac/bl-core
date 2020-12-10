package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import enums.Rank;

public class KorisnikDto {
	@NotBlank(message = "Ime ne moze ostati prazno")
	private String ime;
	@NotBlank(message = "Prezime ne moze ostati prazno")
	private String prezime;
	@Size(min = 9, max = 9, message = "Broj pasosa je uvek 9 karaktera")
	private String brojPasosa;
	private Rank rank;
	
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
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
}

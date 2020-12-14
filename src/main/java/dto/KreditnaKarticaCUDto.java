package dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class KreditnaKarticaCUDto {
	@Min(value = 100000000L, message = "Broj kartice je izmedju 9 i 19 cifara")
	private Long brojKartice;
	@NotBlank(message = "Ime vlasnika ne moze ostati prazno")
	private String imeVlasnika;
	@NotBlank(message = "Prezime vlasnika ne moze ostati prazno")
	private String prezimeVlasnika;
	@Min(value = 100, message = "Sigurnosni broj uvek ima 3 cifre")
	@Max(value = 999, message = "Sigurnosni broj uvek ima 3 cifre")
	private Integer sigurnosniBroj;
	
	public KreditnaKarticaCUDto() {
		
	}
	
	public KreditnaKarticaCUDto(
			@Min(value = 100000000, message = "Broj kartice je izmedju 9 i 19 cifara") Long brojKartice,
			@NotBlank(message = "Ime vlasnika ne moze ostati prazno") String imeVlasnika,
			@NotBlank(message = "Prezime vlasnika ne moze ostati prazno") String prezimeVlasnika,
			@Min(value = 100, message = "Sigurnosni broj uvek ima 3 cifre") @Max(value = 999, message = "Sigurnosni broj uvek ima 3 cifre") Integer sigurnosniBroj) {
		super();
		this.brojKartice = brojKartice;
		this.imeVlasnika = imeVlasnika;
		this.prezimeVlasnika = prezimeVlasnika;
		this.sigurnosniBroj = sigurnosniBroj;
	}
	public Long getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(Long brojKartice) {
		this.brojKartice = brojKartice;
	}
	public String getImeVlasnika() {
		return imeVlasnika;
	}
	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}
	public String getPrezimeVlasnika() {
		return prezimeVlasnika;
	}
	public void setPrezimeVlasnika(String prezimeVlasnika) {
		this.prezimeVlasnika = prezimeVlasnika;
	}
	public Integer getSigurnosniBroj() {
		return sigurnosniBroj;
	}
	public void setSigurnosniBroj(Integer sigurnosniBroj) {
		this.sigurnosniBroj = sigurnosniBroj;
	}
	/*public Long getKorisnikId() {
		return korisnikId;
	}
	public void setKorisnikId(Long korisnikId) {
		this.korisnikId = korisnikId;
	}*/
}

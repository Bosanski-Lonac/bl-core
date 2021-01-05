package dto;

import java.math.BigDecimal;

import javax.validation.constraints.Positive;

public class RezervacijeKorisnikaDto {
	@Positive
	private Integer brojRezervacija;
	@Positive
	private BigDecimal cena;
	
	public Integer getBrojRezervacija() {
		return brojRezervacija;
	}
	public void setBrojRezervacija(Integer brojRezervacija) {
		this.brojRezervacija = brojRezervacija;
	}
	public BigDecimal getCena() {
		return cena;
	}
	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
	public void dodajRezervaciju(BigDecimal cena) {
		this.cena.add(cena);
		this.brojRezervacija++;
	}
}

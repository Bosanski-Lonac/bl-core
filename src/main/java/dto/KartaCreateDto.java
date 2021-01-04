package dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class KartaCreateDto {
	@NotNull
	private Long korisnikId;
	@Positive
	private BigDecimal cena;
	
	public Long getKorisnikId() {
		return korisnikId;
	}
	public void setKorisnikId(Long korisnikId) {
		this.korisnikId = korisnikId;
	}
	public BigDecimal getCena() {
		return cena;
	}
	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
}

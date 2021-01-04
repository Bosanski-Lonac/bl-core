package dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class KartaKSDto {
	@NotNull
	private Long kreditnaKarticaId;
	@Positive
	private BigDecimal cena;
	@Positive
	private Integer milje;
	
	public Long getKreditnaKarticaId() {
		return kreditnaKarticaId;
	}

	public void setKreditnaKarticaId(Long kreditnaKarticaId) {
		this.kreditnaKarticaId = kreditnaKarticaId;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	public Integer getMilje() {
		return milje;
	}

	public void setMilje(Integer milje) {
		this.milje = milje;
	}
}

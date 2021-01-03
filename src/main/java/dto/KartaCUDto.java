package dto;

import java.math.BigDecimal;

public class KartaCUDto {
	private Long kreditnaKarticaId;
	private Long letId;
	// Overwritten by servis za avionske karte and then korisnicki servis.
	private BigDecimal cena;
	private Integer milje;

	public Long getKreditnaKarticaId() {
		return kreditnaKarticaId;
	}

	public void setKreditnaKarticaId(Long kreditnaKarticaId) {
		this.kreditnaKarticaId = kreditnaKarticaId;
	}
	
	public Long getLetId() {
		return letId;
	}

	public void setLetId(Long letId) {
		this.letId = letId;
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

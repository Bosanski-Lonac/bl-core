package dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class KartaReserveDto {
	@NotNull(message = "Mora da bude izabrana kreditna kartica za plaćanje karte")
	private Long kreditnaKarticaId;
	@NotNull(message = "Mora da bude izabran let za kartu")
	private Long letId;
	@Positive(message = "Mora da bude izabrana količina karata za rezervaciju")
	private Integer kolicina;

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

	public Integer getKolicina() {
		return kolicina;
	}

	public void setKolicina(Integer kolicina) {
		this.kolicina = kolicina;
	}
	
}

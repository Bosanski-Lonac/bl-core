package dto;

import javax.validation.constraints.NotNull;

public class KartaReserveDto {
	@NotNull
	private Long kreditnaKarticaId;
	@NotNull
	private Long letId;

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
	
}

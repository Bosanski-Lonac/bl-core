package dto;

import java.sql.Date;

import javax.validation.constraints.NotNull;

public class KartaDto {
	@NotNull
	private Long id;
	@NotNull
	private Long letId;
	@NotNull
	private Date datumKupovine;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLetId() {
		return letId;
	}
	public void setLetId(Long letId) {
		this.letId = letId;
	}
	public Date getDatumKupovine() {
		return datumKupovine;
	}
	public void setDatumKupovine(Date datumKupovine) {
		this.datumKupovine = datumKupovine;
	}
}

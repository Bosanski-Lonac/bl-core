package dto;

import java.math.BigDecimal;
import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class KartaDto {
	@NotNull
	private Long id;
	@NotNull
	private Long letId;
	@NotNull
	private Date datumKupovine;
	@Positive
	private BigDecimal cena;
	
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
	public BigDecimal getCena() {
		return cena;
	}
	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
}

package dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class LetCUDto {
	@NotBlank
	private String pocetnaDestinacija;
	@NotBlank
	private String krajnjaDestinacija;
	@Positive
	private Integer duzina;
	@Positive
	private BigDecimal cena;
	@Positive
	private Integer milje;
	@NotNull
	private Long idAvion;
	
	public LetCUDto(String pocetnaDestinacija, String krajnjaDestinacija, Integer duzina, BigDecimal cena, Integer milje) {
		this.pocetnaDestinacija=pocetnaDestinacija;
		this.krajnjaDestinacija=krajnjaDestinacija;
		this.duzina=duzina;
		this.cena=cena;
		this.milje=milje;
	}
	
	public String getPocetnaDestinacija() {
		return pocetnaDestinacija;
	}
	public void setPocetnaDestinacija(String pocetnaDestinacija) {
		this.pocetnaDestinacija = pocetnaDestinacija;
	}
	public String getKrajnjaDestinacija() {
		return krajnjaDestinacija;
	}
	public void setKrajnjaDestinacija(String krajnjaDestinacija) {
		this.krajnjaDestinacija = krajnjaDestinacija;
	}
	public Integer getDuzina() {
		return duzina;
	}
	public void setDuzina(Integer duzina) {
		this.duzina = duzina;
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
	public Long getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}
}

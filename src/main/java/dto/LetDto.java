package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class LetDto {
	@NotNull
	private Long id;
	@NotBlank
	private String pocetnaDestinacija;
	@NotBlank
	private String krajnjaDestinacija;
	@Positive
	private Integer duzina;
	@Positive
	private Integer cena;
	@NotNull
	private AvionDto avion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Integer getCena() {
		return cena;
	}
	public void setCena(Integer cena) {
		this.cena = cena;
	}
	public AvionDto getAvion() {
		return avion;
	}
	public void setAvion(AvionDto avion) {
		this.avion = avion;
	}
	public Integer getKapacitet() {
		return avion.getKapacitetPutnika();
	}
}

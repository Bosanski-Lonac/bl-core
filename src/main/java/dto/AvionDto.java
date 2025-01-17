package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class AvionDto {
	@NotNull
	private Long id;
	@NotBlank
	private String naziv;
	@Positive
	private Integer kapacitetPutnika;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Integer getKapacitetPutnika() {
		return kapacitetPutnika;
	}
	public void setKapacitetPutnika(Integer kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}
}

package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class AvionCUDto {
	@NotBlank(message = "Avion mora da ima naziv")
	private String naziv;
	@Positive(message = "Avion mora da ima kapacitet veci od 0")
	private Integer kapacitetPutnika;
	
	public AvionCUDto(String naziv, Integer kapacitetPutnika) {
		this.naziv=naziv;
		this.kapacitetPutnika=kapacitetPutnika;
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

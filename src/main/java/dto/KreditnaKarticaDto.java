package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class KreditnaKarticaDto {
	private Long id;
	@Size(min = 9, max = 19)
	private String krajKartice;
	@NotBlank
	private String imeVlasnika;
	@NotBlank
	private String prezimeVlasnika;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKrajKartice() {
		return krajKartice;
	}
	public void setKrajKartice(String krajKartice) {
		this.krajKartice = krajKartice;
	}
	public void odrediKrajKartice(Long brojKartice) {
		krajKartice = String.format("%" + String.valueOf(brojKartice).length() + "s", brojKartice % 100).replace(' ', '*');
	}
	public String getImeVlasnika() {
		return imeVlasnika;
	}
	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}
	public String getPrezimeVlasnika() {
		return prezimeVlasnika;
	}
	public void setPrezimeVlasnika(String prezimeVlasnika) {
		this.prezimeVlasnika = prezimeVlasnika;
	}
}

package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class KreditnaKarticaDto {
	@Size(min = 9, max = 19)
	private String krajKartice;
	@NotBlank
	private String imeVlasnika;
	@NotBlank
	private String prezimeVlasnika;
	
	public String getKrajKartice() {
		return krajKartice;
	}
	public void setKrajKartice(Long brojKartice) {
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

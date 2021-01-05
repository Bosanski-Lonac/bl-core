package dto;

import java.util.Map;

public class PovracajNovcaDto {
	private Map<Long, RezervacijeKorisnikaDto> listaKorisnikCena;
	private LetDto letDto;

	public Map<Long, RezervacijeKorisnikaDto> getListaKorisnikCena() {
		return listaKorisnikCena;
	}

	public void setListaKorisnikCena(Map<Long, RezervacijeKorisnikaDto> listaKorisnikCena) {
		this.listaKorisnikCena = listaKorisnikCena;
	}

	public LetDto getLetDto() {
		return letDto;
	}

	public void setLetDto(LetDto letDto) {
		this.letDto = letDto;
	}
}

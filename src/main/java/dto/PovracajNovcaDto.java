package dto;

import java.util.HashMap;
import java.util.Map;

public class PovracajNovcaDto {
	private Map<Long, RezervacijeDto> listaKorisnikCena;
	private LetDto letDto;
	
	public PovracajNovcaDto() {
		listaKorisnikCena = new HashMap<>();
	}

	public Map<Long, RezervacijeDto> getListaKorisnikCena() {
		return listaKorisnikCena;
	}

	public void setListaKorisnikCena(Map<Long, RezervacijeDto> listaKorisnikCena) {
		this.listaKorisnikCena = listaKorisnikCena;
	}

	public LetDto getLetDto() {
		return letDto;
	}

	public void setLetDto(LetDto letDto) {
		this.letDto = letDto;
	}
}

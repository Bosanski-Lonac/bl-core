package dto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PovracajNovcaDto {
	private Map<Long, BigDecimal> listaKorisnikCena;
	private Integer milje;
	
	public PovracajNovcaDto() {
		listaKorisnikCena = new HashMap<>();
	}

	public Map<Long, BigDecimal> getListaKorisnikCena() {
		return listaKorisnikCena;
	}

	public void setListaKorisnikCena(Map<Long, BigDecimal> listaKorisnikCena) {
		this.listaKorisnikCena = listaKorisnikCena;
	}

	public Integer getMilje() {
		return milje;
	}

	public void setMilje(Integer milje) {
		this.milje = milje;
	}
}

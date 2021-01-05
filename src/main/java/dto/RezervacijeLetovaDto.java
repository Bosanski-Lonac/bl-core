package dto;

import java.util.HashMap;
import java.util.Map;

public class RezervacijeLetovaDto {
	private Map<Long, Integer> listaLetRezervacije;
	
	public RezervacijeLetovaDto() {
		listaLetRezervacije = new HashMap<>();
	}

	public Map<Long, Integer> getListaLetRezervacije() {
		return listaLetRezervacije;
	}

	public void setListaLetRezervacije(Map<Long, Integer> listaLetRezervacije) {
		this.listaLetRezervacije = listaLetRezervacije;
	}
}

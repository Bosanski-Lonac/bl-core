package dto;

import java.util.Set;

import javax.validation.constraints.NotNull;

public class ListaLetovaDto {
	@NotNull(message = "Lista letova mora da postoji")
	private Set<Long> letovi;

	public Set<Long> getLetovi() {
		return letovi;
	}

	public void setLetovi(Set<Long> letovi) {
		this.letovi = letovi;
	}
}

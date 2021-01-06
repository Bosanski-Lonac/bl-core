package dto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class ListaLetovaDto {
	@NotNull(message = "Lista letova mora da postoji")
	private List<Long> letovi;

	public List<Long> getLetovi() {
		return letovi;
	}

	public void setLetovi(List<Long> letovi) {
		this.letovi = letovi;
	}
}

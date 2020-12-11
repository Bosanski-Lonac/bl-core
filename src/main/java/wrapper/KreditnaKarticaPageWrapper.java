package wrapper;

import java.util.List;

import dto.KreditnaKarticaDto;

public class KreditnaKarticaPageWrapper {
	private List<KreditnaKarticaDto> content;

	public List<KreditnaKarticaDto> getContent() {
		return content;
	}

	public void setContent(List<KreditnaKarticaDto> content) {
		this.content = content;
	}
}

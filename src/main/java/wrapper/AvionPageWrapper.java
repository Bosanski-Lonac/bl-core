package wrapper;

import java.util.List;

import dto.AvionDto;

public class AvionPageWrapper {
	private List<AvionDto> content;

	public List<AvionDto> getContent() {
		return content;
	}

	public void setContent(List<AvionDto> content) {
		this.content = content;
	}
}

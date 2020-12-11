package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class AvionDto {
	private Long id;
	@NotBlank
	private String naziv;
	@Positive
	private Integer kapacitetPutnika;
}

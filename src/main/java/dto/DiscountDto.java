package dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class DiscountDto {
	@Min(value = 1)
	@Max(value = 100)
	private Integer discount;

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
}

package demo.imunoz.controller.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductPriceDto {
	private Long productId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Long priceList;
	private Double price;
	private String curr;
	private Long brandId;
}

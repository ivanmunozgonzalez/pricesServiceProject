package demo.imunoz.application.domain.model.productPrice;

import java.time.LocalDateTime;

import demo.imunoz.application.domain.model.brand.Brand;
import demo.imunoz.application.domain.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductPrice {

	private Long id;
	private Product product;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Long priceList;
	private Long priority;
	private Double price;
	private String curr;
	private Brand brand;

}

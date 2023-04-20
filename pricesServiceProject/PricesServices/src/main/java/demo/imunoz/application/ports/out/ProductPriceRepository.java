package demo.imunoz.application.ports.out;

import java.time.LocalDateTime;

import demo.imunoz.application.domain.exception.DomainException;
import demo.imunoz.application.domain.exception.EntityNotFoundException;
import demo.imunoz.application.domain.model.productPrice.ProductPrice;

public interface ProductPriceRepository {

	ProductPrice findFirstProductPriceByDateOrderByPriority(LocalDateTime applicationDate, Long productId, Long brandId)
			throws EntityNotFoundException, DomainException;
}
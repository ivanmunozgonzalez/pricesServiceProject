package demo.imunoz.application.domain.ports.in.useCase;

import demo.imunoz.application.domain.exception.DateFormatException;
import demo.imunoz.application.domain.exception.DomainException;
import demo.imunoz.application.domain.exception.EntityNotFoundException;
import demo.imunoz.application.domain.model.productPrice.ProductPrice;

public interface GetProductPriceInDateAndPriorityUseCase {

	ProductPrice execute(Long productId, Long brandId, String applicationDate)
			throws DomainException, EntityNotFoundException, DateFormatException;
}
package demo.imunoz.application.useCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.imunoz.application.domain.exception.DateFormatException;
import demo.imunoz.application.domain.exception.DomainException;
import demo.imunoz.application.domain.exception.EntityNotFoundException;
import demo.imunoz.application.domain.model.productPrice.ProductPrice;
import demo.imunoz.application.domain.ports.in.services.ProductPriceServicePort;
import demo.imunoz.application.domain.ports.in.useCase.GetProductPriceInDateAndPriorityUseCase;

@Service
public class GetProductPriceInDateAndPriority implements GetProductPriceInDateAndPriorityUseCase {

	@Autowired
	private ProductPriceServicePort productPriceServicePort;

	@Override
	public ProductPrice execute(Long productId, Long brandId, String applicationDate)
			throws DomainException, EntityNotFoundException, DateFormatException {
		return productPriceServicePort.getProductPriceByFilter(productId, brandId, applicationDate);
	}
}

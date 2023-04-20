package demo.imunoz.controller.productPrice;

import static demo.imunoz.controller.Constants.BRAND_ID_PARAMETER;
import static demo.imunoz.controller.Constants.DATE_APPLICATION_PARAMETER;
import static demo.imunoz.controller.Constants.PRODUCT_ID_PARAMETER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import demo.imunoz.application.domain.exception.DateFormatException;
import demo.imunoz.application.domain.exception.DomainException;
import demo.imunoz.application.domain.exception.EntityNotFoundException;
import demo.imunoz.application.domain.ports.in.useCase.GetProductPriceInDateAndPriorityUseCase;
import demo.imunoz.controller.dto.ProductPriceDto;
import demo.imunoz.controller.dto.ProductPriceDtoMapper;

@RestController
@RequestMapping("/api/productPrice")
public class ProductPriceController {

	@Autowired
	private GetProductPriceInDateAndPriorityUseCase getProductPriceInDateAndPriorityUseCase;

	@Autowired
	private ProductPriceDtoMapper productPriceDtoMapper;

	@GetMapping(value = "/{productId}/{brandId}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<ProductPriceDto> getProductPriceInDateAndPriority(
			@PathVariable(value = PRODUCT_ID_PARAMETER, required = true) Long productId,
			@PathVariable(value = BRAND_ID_PARAMETER, required = true) Long brandId,
			@RequestParam(value = DATE_APPLICATION_PARAMETER, required = true) String applicationDate)
			throws DomainException, EntityNotFoundException, DateFormatException {

		return ResponseEntity.status(HttpStatus.OK).body(productPriceDtoMapper
				.toDTO(getProductPriceInDateAndPriorityUseCase.execute(productId, brandId, applicationDate)));
	}
}

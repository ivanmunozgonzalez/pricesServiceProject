package demo.imunoz.application.service;

import static demo.imunoz.controller.Constants.DATE_FORMAT_PRODUCT_PRICE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.imunoz.application.domain.exception.DateFormatException;
import demo.imunoz.application.domain.exception.DomainException;
import demo.imunoz.application.domain.exception.EntityNotFoundException;
import demo.imunoz.application.domain.model.productPrice.ProductPrice;
import demo.imunoz.application.domain.ports.in.services.ProductPriceServicePort;
import demo.imunoz.application.ports.out.ProductPriceRepository;

@Service
public class ProductPriceService implements ProductPriceServicePort {

	@Autowired
	private ProductPriceRepository productPriceRepository;

	@Override
	public ProductPrice getProductPriceByFilter(Long productId, Long brandId, String applicationDate)
			throws DomainException, EntityNotFoundException, DateFormatException {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_PRODUCT_PRICE);
		try {
			LocalDateTime applicationDateFormated = LocalDateTime.parse(applicationDate, formatter);

			return productPriceRepository.findFirstProductPriceByDateOrderByPriority(applicationDateFormated, productId,
					brandId);
		} catch (DateTimeParseException e) {
			throw DateFormatException.of(applicationDate, DATE_FORMAT_PRODUCT_PRICE);
		}
	}
}

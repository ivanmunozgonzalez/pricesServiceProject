package demo.imunoz.infrastructure.persistence.productPrice.repository;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.imunoz.application.domain.exception.DomainException;
import demo.imunoz.application.domain.exception.EntityNotFoundException;
import demo.imunoz.application.domain.model.productPrice.ProductPrice;
import demo.imunoz.application.ports.out.ProductPriceRepository;
import demo.imunoz.infrastructure.persistence.productPrice.ProductPriceEntity;
import demo.imunoz.infrastructure.persistence.productPrice.ProductPriceEntityMapper;

@Repository
public class ProductPriceH2Repository implements ProductPriceRepository {

	@Autowired
	private ProductPriceJPARepository productPriceJPARepository;

	@Autowired
	private ProductPriceEntityMapper productPriceEntityMapper;

	@Override
	public ProductPrice findFirstProductPriceByDateOrderByPriority(LocalDateTime applicationDate, Long productId,
			Long brandId) throws EntityNotFoundException, DomainException {
		ProductPriceEntity productPricesEntity = productPriceJPARepository
				.findTop1ByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
						productId, brandId, applicationDate, applicationDate);
		if (productPricesEntity != null) {
			return productPriceEntityMapper.toModel(productPricesEntity);
		} else {
			throw EntityNotFoundException.of(ProductPriceEntity.class.getSimpleName());
		}
	}
}

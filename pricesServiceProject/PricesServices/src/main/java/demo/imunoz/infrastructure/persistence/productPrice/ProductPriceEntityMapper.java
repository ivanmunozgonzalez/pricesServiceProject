package demo.imunoz.infrastructure.persistence.productPrice;

import org.mapstruct.Mapper;

import demo.imunoz.application.domain.model.productPrice.ProductPrice;

@Mapper(componentModel = "spring")
public interface ProductPriceEntityMapper {

	ProductPrice toModel(ProductPriceEntity entity);
}
package demo.imunoz.infrastructure.persistence.product;

import org.mapstruct.Mapper;

import demo.imunoz.application.domain.model.product.Product;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

	Product toModel(ProductEntity entity);
}
package demo.imunoz.controller.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import demo.imunoz.application.domain.model.productPrice.ProductPrice;

@Mapper(componentModel = "spring")
public interface ProductPriceDtoMapper {

	@Mapping(target = "brandId", source = "brand.id")
	@Mapping(target = "productId", source = "product.id")
	ProductPriceDto toDTO(ProductPrice model);

}
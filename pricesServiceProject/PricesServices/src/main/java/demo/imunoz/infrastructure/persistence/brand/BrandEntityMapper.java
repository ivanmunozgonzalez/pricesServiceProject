package demo.imunoz.infrastructure.persistence.brand;

import org.mapstruct.Mapper;

import demo.imunoz.application.domain.model.brand.Brand;

@Mapper(componentModel = "spring")
public interface BrandEntityMapper {

	Brand toModel(BrandEntity entity);
}
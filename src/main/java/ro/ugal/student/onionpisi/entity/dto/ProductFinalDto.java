package ro.ugal.student.onionpisi.entity.dto;

import lombok.Builder;
import lombok.Data;
import ro.ugal.student.onionpisi.entity.ProductFinal;
import ro.ugal.student.onionpisi.entity.ProductFinalPrice;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class ProductFinalDto {

    private String name;
    private String descriptionShort;
    private String descriptionLong;
    private Float price;

    public static ProductFinalDto toDto (ProductFinal entity) {
        return ProductFinalDto.builder()
                .name(entity.getName())
                .descriptionShort(entity.getDescriptionShort())
                .descriptionLong(entity.getDescriptionLong())
                .build();
    }

    public static ProductFinalDto toDto (ProductFinal entity, Float price) {
        return ProductFinalDto.builder()
                .name(entity.getName())
                .price(price)
                .descriptionShort(entity.getDescriptionShort())
                .descriptionLong(entity.getDescriptionLong())
                .build();
    }

    public static ProductFinalDto toDto (ProductFinalPrice entity) {
        return ProductFinalDto.builder()
                .name(entity.getProductFinal().getName())
                .descriptionShort(entity.getProductFinal().getDescriptionShort())
                .descriptionLong(entity.getProductFinal().getDescriptionLong())
                .price(entity.getPriceFinal())
                .build();
    }

    public static List<ProductFinalDto> toDto(List<ProductFinal> entity) {
        return entity.stream()
                .map(ProductFinalDto::toDto)
                .collect(Collectors.toList());
    }

}

package ro.ugal.student.onionpisi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.ugal.student.onionpisi.entity.ProductFinal;
import ro.ugal.student.onionpisi.entity.ProductFinalPrice;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductFinalDTO {

    private Integer id;
    private String name;
    private String descriptionShort;
    private String descriptionLong;
    private Float price;

    public static ProductFinalDTO fromEntityToDTO(ProductFinal entity){
        return ProductFinalDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .descriptionShort(entity.getDescriptionShort())
                .descriptionLong(entity.getDescriptionLong())
                .build();
    }
    public static ProductFinalDTO fromEntityToDTO(ProductFinalPrice entity){
        return ProductFinalDTO.builder()
                .id(entity.getProductFinal().getId())
                .name(entity.getProductFinal().getName())
                .descriptionShort(entity.getProductFinal().getDescriptionShort())
                .descriptionLong(entity.getProductFinal().getDescriptionLong())
                .price(entity.getPriceNoVat())
                .build();
    }

    public static Float findPrice(List<ProductFinalPrice> entity, Integer productFinalId) {
        return entity.stream()
                .filter(e -> e.getProductFinal().getId() == productFinalId ? true : false)
                .filter(ProductFinalPrice::getActive)
                .map(e -> e.getPriceNoVat())
                .collect(Collectors.toList()).get(0);
    }
}

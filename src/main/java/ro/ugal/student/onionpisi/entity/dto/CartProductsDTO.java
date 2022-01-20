package ro.ugal.student.onionpisi.entity.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartProductsDTO {

    private String name;
    private String productUuid;
    private Float price;
    private Integer quantity;
    private Float value;

}

package ro.ugal.student.onionpisi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "cart_products")
@Data
public class CartProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String shoppingCartUuid;

    private String productFinalUuid;

    private Integer quantity;

}

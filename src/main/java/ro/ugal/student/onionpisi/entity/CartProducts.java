package ro.ugal.student.onionpisi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "cart_products")
@Data
public class CartProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "shopping_cart_id")
    private ShoppingCart shoppingCart;

    @OneToOne
    @JoinColumn(name = "product_final_id")
    private ProductFinal productFinal;

    private Integer quantity;

}

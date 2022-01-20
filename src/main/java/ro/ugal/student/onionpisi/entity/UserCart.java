package ro.ugal.student.onionpisi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "user_cart")
@Data
public class UserCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "shopping_cart_id")
    private ShoppingCart shoppingCart;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Boolean active;


}

package ro.ugal.student.onionpisi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.ugal.student.onionpisi.entity.CartProducts;

import java.util.List;
import java.util.Optional;

public interface ICartProductsRepository extends JpaRepository<CartProducts, Integer> {

    List<CartProducts> findAllByShoppingCartUuid(String uuid);

    @Query("select count(id) from cart_products where shoppingCartUuid= ?1 and productFinalUuid= ?2")
    Optional<Integer> countProducts(String cartKey, String productUuid);

    Optional<CartProducts> findCartProductsByShoppingCartUuidAndProductFinalUuid(String cartKey, String productUuid);

}

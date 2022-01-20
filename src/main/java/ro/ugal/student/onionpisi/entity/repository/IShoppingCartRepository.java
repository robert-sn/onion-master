package ro.ugal.student.onionpisi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ugal.student.onionpisi.entity.ShoppingCart;

import java.util.Optional;

public interface IShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
    Optional<ShoppingCart> findByUuid(String cartKey);
}

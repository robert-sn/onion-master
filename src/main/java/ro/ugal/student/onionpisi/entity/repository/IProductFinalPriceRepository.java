package ro.ugal.student.onionpisi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ugal.student.onionpisi.entity.ProductFinalPrice;

public interface IProductFinalPriceRepository extends JpaRepository<ProductFinalPrice, Integer> {
}

package ro.ugal.student.onionpisi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ugal.student.onionpisi.entity.ProductFinal;

import java.util.Optional;

public interface IProductFinalRepository extends JpaRepository<ProductFinal, Integer> {

    Optional<ProductFinal> findByUuid(String uuid);
}

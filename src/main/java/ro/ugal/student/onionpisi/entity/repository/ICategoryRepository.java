package ro.ugal.student.onionpisi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ugal.student.onionpisi.entity.Category;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findAllByCategoryIdIsNull();

}

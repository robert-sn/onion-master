package ro.ugal.student.onionpisi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ugal.student.onionpisi.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
}

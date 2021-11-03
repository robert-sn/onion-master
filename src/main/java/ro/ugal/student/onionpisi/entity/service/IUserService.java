package ro.ugal.student.onionpisi.entity.service;

import org.springframework.context.annotation.Configuration;
import ro.ugal.student.onionpisi.entity.User;
import ro.ugal.student.onionpisi.entity.repository.IUserRepository;

@Configuration
public class IUserService {

    private IUserRepository userRepository;

    public IUserService (IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean saveUser(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        userRepository.save(user);

        if (user.getId() == null) {
            return false;
        }

        return true;
    }



}

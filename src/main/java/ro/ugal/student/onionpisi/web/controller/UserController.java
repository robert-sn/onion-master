package ro.ugal.student.onionpisi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import ro.ugal.student.onionpisi.entity.service.IUserService;

@Controller
public class UserController {

    private IUserService iUserService;

    public UserController (IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping(path = "/user/login")
    public String userAuthenticate(String username, String password) {

        System.out.println("After login" + username + " | " + password);

        boolean isSaved = iUserService.saveUser(username, password);
        if (isSaved) {
            System.out.println("User was saved successfully!");
        }

        return "redirect:/";
    }

}

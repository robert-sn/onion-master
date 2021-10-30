package ro.ugal.student.onionpisi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(path = "")
    public String getStartPage(){
        return "index";
    }

    @GetMapping(path = "/login")
    public String getLoginPage(){
        return "login";
    }

}

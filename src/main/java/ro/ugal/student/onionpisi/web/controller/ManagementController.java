package ro.ugal.student.onionpisi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagementController {

    @GetMapping(path = "/management-page")
    public String getManagementPage() {

        return "management-page";
    }

}

package ro.ugal.student.onionpisi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.ugal.student.onionpisi.entity.service.CategoryService;

@Controller
public class MainController {

    private CategoryService categoryService;

    public MainController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path = "")
    public String getStartPage(Model model){

        model.addAttribute("categories", categoryService.findAllCategories());

        return "index";
    }

    @GetMapping(path = "/register")
    public String getRegisterPage(){
        return "register";
    }

}

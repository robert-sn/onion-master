package ro.ugal.student.onionpisi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.ugal.student.onionpisi.entity.service.CategoryService;
import ro.ugal.student.onionpisi.entity.service.ProductFinalService;

@Controller
public class MainController {

    private CategoryService categoryService;
    private ProductFinalService productFinalService;

    public MainController(CategoryService categoryService,
                          ProductFinalService productFinalService) {
        this.categoryService = categoryService;
        this.productFinalService = productFinalService;
    }

    @GetMapping(path = "")
    public String getStartPage(Model model){

        model.addAttribute("categories", categoryService.findAllCategories());
        model.addAttribute("subcategories", categoryService.findAllLastCategoryLevel());
        model.addAttribute("products", productFinalService.findAll());
        return "index";
    }

    @GetMapping(path = "/register")
    public String getRegisterPage(){
        return "register";
    }

}

package ro.ugal.student.onionpisi.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ugal.student.onionpisi.entity.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    public  CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping(path = "/main")
    public ResponseEntity findAllMainCategory() {
        return ResponseEntity.ok(categoryService.findAllCategories());
    }
}

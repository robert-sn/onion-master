package ro.ugal.student.onionpisi.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ugal.student.onionpisi.entity.service.ProductFinalService;

@RestController
@RequestMapping(path = "/product")
public class ProductFinalController {

    private ProductFinalService productFinalService;

    public ProductFinalController(ProductFinalService productFinalService) {
        this.productFinalService = productFinalService;
    }

    @GetMapping(path = "/find")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(productFinalService.findAll());
    }

}

package ro.ugal.student.onionpisi.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.ugal.student.onionpisi.entity.service.ShoppingCartService;

@RestController
@RequestMapping("/api/shopping-cart")
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping("/save-product")
    public ResponseEntity saveProductToCart(@RequestParam String cartKey, @RequestParam String productUuid) {

        shoppingCartService.addProductToShoppingCart(cartKey, productUuid);
        return ResponseEntity.ok("Success");
    }

}

package ro.ugal.student.onionpisi.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ro.ugal.student.onionpisi.entity.dto.CartProductsDTO;
import ro.ugal.student.onionpisi.entity.service.ShoppingCartService;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.DoubleStream;

@Slf4j
@Controller
public class ShoppingCartWebController {

    private ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartWebController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "/shopping-cart")
    public String shoppingCart(HttpSession session, Model model) {

        if(session.isNew()) {
            return "redirect:/";
        }
        String cartKey = String.valueOf(session.getAttribute("cartKey"));
        List<CartProductsDTO> cartProductsList = shoppingCartService.findCartProducts(cartKey);

        log.info("This user has [{}] products in his cart", cartProductsList);

        BigDecimal totalValue = new BigDecimal(cartProductsList.stream()
                .flatMapToDouble(c -> DoubleStream.of(c.getValue())).sum());

        model.addAttribute("cartProducts", cartProductsList);
        model.addAttribute("totalValue", totalValue.floatValue());

        return "shopping-cart";
    }

    @GetMapping(path = "/shopping-cart/add/{productId}")
    public String addProductToCart(@PathVariable String productId, HttpSession session, Model model) {

        String cartKey = String.valueOf(session.getAttribute("cartKey"));
        shoppingCartService.addProductToShoppingCart(cartKey, productId);

        return "redirect:/shopping-cart";
    }
    @GetMapping(path = "/shopping-cart/remove/{productId}")
    public String removeProductFromCart(@PathVariable String productId, HttpSession session, Model model) {

        String cartKey = String.valueOf(session.getAttribute("cartKey"));
        shoppingCartService.removeProductFromShoppingCart(cartKey, productId);

        return "redirect:/shopping-cart";
    }

}

package ro.ugal.student.onionpisi.web.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import ro.ugal.student.onionpisi.entity.CartProducts;
import ro.ugal.student.onionpisi.entity.dto.CartProductsDTO;
import ro.ugal.student.onionpisi.entity.service.CategoryService;
import ro.ugal.student.onionpisi.entity.service.ProductFinalService;
import ro.ugal.student.onionpisi.entity.service.ShoppingCartService;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.DoubleStream;

@Controller
@Slf4j
public class MainController {

    private CategoryService categoryService;
    private ProductFinalService productFinalService;
    private ShoppingCartService shoppingCartService;

    @Autowired
    public MainController(CategoryService categoryService,
                          ProductFinalService productFinalService,
                          ShoppingCartService shoppingCartService) {
        this.categoryService = categoryService;
        this.productFinalService = productFinalService;
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "")
    public String getStartPage(Model model, HttpSession session){

        handleShoppingCart(session);
        handleMainPageAttributes(model);

        return "index";
    }

    @GetMapping(path = "/register")
    public String getRegisterPage(){
        return "register";
    }


    @GetMapping(path = "/product/details/{productUuid}")
    public String productDetails(@PathVariable String productUuid, Model model) {

        model.addAttribute("product", productFinalService.findByUuid(productUuid));
        System.out.println(productUuid);

        return "product-details";
    }

    private void handleShoppingCart(HttpSession session) {
        if (session.isNew()) {
            String cartKey = UUID.randomUUID().toString();
            log.info("Generated cartKey for this session is [{}]", cartKey);
            session.setAttribute("cartKey", cartKey);
            shoppingCartService.saveShoppingCartKey(cartKey);
        } else {
            log.info("Existing cartKey for this session is [{}]", session.getAttribute("cartKey"));
        }
    }

    private void handleMainPageAttributes(Model model) {
        model.addAttribute("categories", categoryService.findAllCategories());
        model.addAttribute("subcategories", categoryService.findAllLastCategoryLevel());
        model.addAttribute("products", productFinalService.findAll());
    }

}

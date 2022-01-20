package ro.ugal.student.onionpisi.entity.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import ro.ugal.student.onionpisi.entity.CartProducts;
import ro.ugal.student.onionpisi.entity.ProductFinal;
import ro.ugal.student.onionpisi.entity.ProductFinalPrice;
import ro.ugal.student.onionpisi.entity.ShoppingCart;
import ro.ugal.student.onionpisi.entity.dto.CartProductsDTO;
import ro.ugal.student.onionpisi.entity.repository.ICartProductsRepository;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalPriceRepository;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalRepository;
import ro.ugal.student.onionpisi.entity.repository.IShoppingCartRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Configuration
public class ShoppingCartService {

    private IShoppingCartRepository shoppingCartRepository;
    private ICartProductsRepository cartProductsRepository;
    private IProductFinalRepository productFinalRepository;
    private IProductFinalPriceRepository productFinalPriceRepository;

    @Autowired
    public ShoppingCartService(IShoppingCartRepository shoppingCartRepository,
                               ICartProductsRepository cartProductsRepository,
                               IProductFinalRepository iProductFinalRepository,
                               IProductFinalPriceRepository productFinalPriceRepository) {

        this.shoppingCartRepository = shoppingCartRepository;
        this.cartProductsRepository = cartProductsRepository;
        this.productFinalRepository = iProductFinalRepository;
        this.productFinalPriceRepository = productFinalPriceRepository;
    }

    public void saveShoppingCartKey(String shoppingCartKey) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUuid(shoppingCartKey);
        shoppingCart.setTimestamp(LocalDate.now());

        shoppingCartRepository.save(shoppingCart);
        log.info("Shopping cart key saved with id [{}] at [{}]", shoppingCart.getId(), shoppingCart.getTimestamp());

    }

    public List<CartProductsDTO> findCartProducts (String cartKey) {

        return cartProductsRepository.findAllByShoppingCartUuid(cartKey).stream().map(c -> {
            ProductFinal productFinal = productFinalRepository.findByUuid(c.getProductFinalUuid()).get();
            ProductFinalPrice productPrice = productFinalPriceRepository.findByProductFinalId(productFinal.getId());
            return CartProductsDTO.builder()
                    .name(productFinal.getName())
                    .price(productPrice.getPriceFinal())
                    .quantity(c.getQuantity())
                    .value(BigDecimal.valueOf(productPrice.getPriceFinal() * c.getQuantity()).floatValue())
                    .build();
        }).collect(Collectors.toList());
    }

    public void addProductToShoppingCart(String cartKey, String productUuid) {

        Optional<Integer> productsFound = cartProductsRepository.countProducts(cartKey, productUuid);

        if (productsFound.isPresent() && productsFound.get() == 0) {

            CartProducts cartProducts = new CartProducts();
            cartProducts.setShoppingCartUuid(cartKey);
            cartProducts.setProductFinalUuid(productUuid);
            cartProducts.setQuantity(1);

            cartProductsRepository.save(cartProducts);
            log.info("Product [{}] exist in cart [{}], [{}] times", cartKey, productUuid, cartProducts.getQuantity());
        } else {
            CartProducts cartProducts = cartProductsRepository
                    .findCartProductsByShoppingCartUuidAndProductFinalUuid(cartKey, productUuid)
                    .get();
            if (cartProducts != null) {
                cartProducts.setQuantity(1 + cartProducts.getQuantity());
                cartProductsRepository.save(cartProducts);
                log.info("Product [{}] exist in cart [{}], [{}] times",
                        cartKey, productUuid, cartProducts.getQuantity());
            }
        }





    }
}

package ro.ugal.student.onionpisi.entity.service;

import org.springframework.context.annotation.Configuration;
import ro.ugal.student.onionpisi.entity.ProductFinal;
import ro.ugal.student.onionpisi.entity.dto.ProductFinalDto;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalPriceRepository;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalRepository;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class ProductFinalService {

    private IProductFinalRepository productFinalRepository;
    private IProductFinalPriceRepository productFinalPriceRepository;

    public ProductFinalService(IProductFinalRepository productFinalRepository, IProductFinalPriceRepository productFinalPriceRepository) {
        this.productFinalRepository = productFinalRepository;
        this.productFinalPriceRepository = productFinalPriceRepository;
    }

    public List<ProductFinalDto> findAll() {
        List<ProductFinal> products = productFinalRepository.findAll();

        return products.stream()
                .map(productFinal ->
                        ProductFinalDto.toDto(
                                productFinal,
                                productFinalPriceRepository.findByProductFinalId(productFinal.getId()).getPriceFinal()
                        )
                )
                .collect(Collectors.toList());
    }

    public ProductFinalDto findByUuid(String productUuid) {
        ProductFinal productFinal = productFinalRepository.findByUuid(productUuid).get();
        return ProductFinalDto.toDto(productFinal,
                productFinalPriceRepository.findByProductFinalId(productFinal.getId()).getPriceFinal());
    }

}

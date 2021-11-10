package ro.ugal.student.onionpisi.entity.service;

import org.springframework.context.annotation.Configuration;
import ro.ugal.student.onionpisi.entity.dto.ProductFinalDto;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalPriceRepository;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalRepository;

import java.util.List;

@Configuration
public class ProductFinalService {

    private IProductFinalRepository productFinalRepository;
    private IProductFinalPriceRepository productFinalPriceRepository;

    public ProductFinalService(IProductFinalRepository productFinalRepository, IProductFinalPriceRepository productFinalPriceRepository) {
        this.productFinalRepository = productFinalRepository;
        this.productFinalPriceRepository = productFinalPriceRepository;
    }

    public List<ProductFinalDto> findAll() {
        return ProductFinalDto.toDto(productFinalRepository.findAll());
    }

}

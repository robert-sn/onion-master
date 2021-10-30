package ro.ugal.student.onionpisi.entity.service;

import org.springframework.context.annotation.Configuration;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalPriceRepository;
import ro.ugal.student.onionpisi.entity.repository.IProductFinalRepository;
import ro.ugal.student.onionpisi.model.ProductFinalDTO;

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

    public List<ProductFinalDTO> findAll() {
        return productFinalPriceRepository.findAll().stream()
                .map(ProductFinalDTO::fromEntityToDTO)
                .collect(Collectors.toList());
    }

}

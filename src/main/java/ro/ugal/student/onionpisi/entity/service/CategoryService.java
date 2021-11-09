package ro.ugal.student.onionpisi.entity.service;

import org.springframework.context.annotation.Configuration;
import ro.ugal.student.onionpisi.entity.dto.CategoryDto;
import ro.ugal.student.onionpisi.entity.repository.ICategoryRepository;

import java.util.List;

@Configuration
public class CategoryService {

    private ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDto> findAllMainCategory() {
        return CategoryDto.toDto(categoryRepository.findAllByCategoryIdIsNull());
    }

}

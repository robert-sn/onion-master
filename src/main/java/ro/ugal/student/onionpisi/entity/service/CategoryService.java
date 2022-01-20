package ro.ugal.student.onionpisi.entity.service;

import org.springframework.context.annotation.Configuration;
import ro.ugal.student.onionpisi.entity.Category;
import ro.ugal.student.onionpisi.entity.dto.CategoryDto;
import ro.ugal.student.onionpisi.entity.repository.ICategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class CategoryService {

    private ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDto> findAllCategories() {
        return CategoryDto.toDto(categoryRepository.findAllByCategoryIdIsNull());
    }

    public List<Category> findAllLastCategoryLevel(){

        return categoryRepository.findAll().stream()
                .filter(c -> !hastChild(c))
                .collect(Collectors.toList());
    }

    //if false it's mean it's a parent
    public boolean hastParent(Category category){
        return categoryRepository.findById(category.getCategory().getId()) == null ? false : true;
    }
    //if false it's meant is last level of child
    public boolean hastChild(Category category){
        return categoryRepository.findAllByCategoryId(category.getId()).isEmpty() ? false : true;
    }

}

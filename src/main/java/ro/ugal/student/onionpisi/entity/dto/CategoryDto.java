package ro.ugal.student.onionpisi.entity.dto;

import lombok.Builder;
import lombok.Data;
import ro.ugal.student.onionpisi.entity.Category;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class CategoryDto {

    private String name;

    public static CategoryDto toDto (Category entity) {
        return CategoryDto.builder()
                .name(entity.getName())
                .build();
    }

    public static List<CategoryDto> toDto (List<Category> entity) {
        return entity.stream()
                .map(CategoryDto::toDto)
                .collect(Collectors.toList());
    }
}

package edu.pe.trentino.services;

import edu.pe.trentino.dto.CategoryDto;
import edu.pe.trentino.entidad.Category;
import edu.pe.trentino.repository.CategoryRepository;
import edu.pe.trentino.utils.SlugUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public void createCategory(CategoryDto categoryDto) {
        var slug = SlugUtils.slugify(categoryDto.getName());
        var category = Category.builder()
                .name(categoryDto.getName())
                .slug(slug)
                .createdAt(LocalDateTime.now())
                .build();
        categoryRepository.save(category);
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .toList();
    }

    @Override
    public void updatedCategory(Long id, CategoryDto categoryDto) {
        var slug = SlugUtils.slugify(categoryDto.getName());
        Optional<Category> categoryExist = categoryRepository.findById(id);
        if (categoryExist.isPresent()) {
            var category = categoryExist.get();
            category.setName(categoryDto.getName());
            category.setSlug(slug);
            category.setUpdatedAt(LocalDateTime.now());
            categoryRepository.save(category);
        }
    }

    @Override
    public void deleteCategory(Long id) {
        Optional<Category> catById = categoryRepository.findById(id);
        if (catById.isPresent()) {
            categoryRepository.deleteById(id);
        }
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }
}

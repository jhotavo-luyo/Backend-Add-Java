package edu.pe.trentino.services;

import edu.pe.trentino.dto.CategoryDto;
import edu.pe.trentino.entidad.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    void createCategory(CategoryDto categoryDto);
    List<Category> findAllCategories();
    void updatedCategory(Long id, CategoryDto categoryDto);
    void deleteCategory(Long id);
    Optional<Category> getCategoryById(Long id);
}

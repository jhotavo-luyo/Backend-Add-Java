package edu.pe.trentino.controllers;

import edu.pe.trentino.dto.CategoryDto;
import edu.pe.trentino.services.CategoryServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@AllArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryServiceImpl categoryService;

    @PostMapping("create")
    public ResponseEntity<?> createCategory(@RequestBody CategoryDto dto) {
        categoryService.createCategory(dto);
        return ResponseEntity
                .ok(Collections
                .singletonMap("message", "Category create successfully"));
    }

    @GetMapping("all")
    public ResponseEntity<?> getAllCategories() {
        return ResponseEntity.ok(categoryService.findAllCategories());
    }

    @PutMapping("update/{categoryId}")
    public ResponseEntity<?> updateCategory(
            @PathVariable(name = "categoryId") Long categoryId,
            @RequestBody CategoryDto dto
    ) {
        categoryService.updatedCategory(categoryId, dto);
        return ResponseEntity
                .ok(Collections
                .singletonMap("message", "Category updated successfully"));
    }

    @DeleteMapping("delete/{categoryId}")
    public ResponseEntity<?> deleteCategory(
            @PathVariable(name = "categoryId") Long categoryId
    ) {
        categoryService.deleteCategory(categoryId);
        return ResponseEntity
                .ok(Collections
                        .singletonMap("message", "Category delete successfully"));
    }
}

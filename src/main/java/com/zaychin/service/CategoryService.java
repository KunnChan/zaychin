package com.zaychin.service;

import com.zaychin.entity.Category;
import com.zaychin.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CategoryService(CategoryRepository categoryRepository) {

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(int categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}

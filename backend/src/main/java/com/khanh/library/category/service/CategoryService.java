package com.khanh.library.category.service;

import com.khanh.library.category.entity.Category;
import com.khanh.library.category.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository catergoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.catergoryRepository = categoryRepository;
    }
    public List<Category> getAllCategories() {
        return catergoryRepository.findAll();
    }

}

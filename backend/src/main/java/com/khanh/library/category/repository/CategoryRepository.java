package com.khanh.library.category.repository;

import com.khanh.library.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

        }

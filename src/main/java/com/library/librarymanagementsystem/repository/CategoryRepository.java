package com.library.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

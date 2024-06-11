package com.library.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}

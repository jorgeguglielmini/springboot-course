package com.guglielminijorge.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guglielminijorge.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

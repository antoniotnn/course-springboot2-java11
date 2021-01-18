package com.tnn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnn.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}

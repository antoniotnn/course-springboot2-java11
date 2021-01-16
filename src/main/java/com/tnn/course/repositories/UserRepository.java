package com.tnn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnn.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}

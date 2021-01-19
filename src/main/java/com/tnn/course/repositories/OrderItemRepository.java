package com.tnn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnn.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}

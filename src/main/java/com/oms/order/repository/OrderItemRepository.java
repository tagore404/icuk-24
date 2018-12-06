package com.oms.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oms.order.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}

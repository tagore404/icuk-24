package com.oms.order.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.order.domain.Customer;
import com.oms.order.domain.Order;

@Repository
public interface OrderRespository extends JpaRepository<Order, Integer>{
	
	public Set<Order> findByCustomer(Customer customer);

}

package com.oms.order.service;

import java.util.Set;

import com.oms.order.domain.Customer;
import com.oms.order.domain.Order;

public interface OrderService {
	
	public Order getOrder(int orderId);
	
	public Set<Order> getAllOrders();
	
	public void createOrder(Order order);
	
	public void updateOrder(Order order);
	
	public void deleteOrder(int orderId);
	
	public Set<Order> findOrdersByCustomerId(Customer customer);

}

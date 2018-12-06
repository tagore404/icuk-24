package com.oms.order.serviceimpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.order.domain.Customer;
import com.oms.order.domain.Order;
import com.oms.order.repository.OrderRespository;
import com.oms.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRespository orderRespository;

	@Override
	public Order getOrder(int orderId) {
		Order order =  orderRespository.getOne(orderId);
		return order;
	}

	@Override
	public Set<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Order> findOrdersByCustomerId(Customer customer) {
		Set<Order> orderSet = orderRespository.findByCustomer(customer);
		return orderSet;
	}

}

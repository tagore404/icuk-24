package com.oms.order.resource;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.order.domain.Customer;
import com.oms.order.domain.Order;
import com.oms.order.exception.OrderNotFoundException;
import com.oms.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderResource {

	@Autowired
	private OrderService orderService;

	@GetMapping("/get/{orderId}")
	public Order findOrderById(@PathVariable int orderId) {
		Order order = orderService.getOrder(orderId);
		if (order == null) {
			throw new OrderNotFoundException("Not valid order");

		}
		return order;
	}

	@GetMapping("/getOrders/{customerId}")
	public Set<Order> findOrdersByCustomerId(@PathVariable int customerId) {
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		Set<Order> orderSet = orderService.findOrdersByCustomerId(customer);
		if (orderSet == null) {
			throw new OrderNotFoundException("No Orders Found");

		}
		return orderSet;
	}
}

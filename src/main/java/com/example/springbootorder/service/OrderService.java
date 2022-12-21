package com.example.springbootorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	

	public boolean insert(Order order) {
		this.orderRepository.insert(order);
		return true;
	}
	
	public List<Order> findAll() {
		return this.orderRepository.findAll();
	}
	
	public boolean update(Order order) {
		this.orderRepository.update(order);
		return true;
	}
	
}

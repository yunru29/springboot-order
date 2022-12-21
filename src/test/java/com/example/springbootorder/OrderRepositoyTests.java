package com.example.springbootorder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springbootorder.service.Order;
import com.example.springbootorder.service.OrderRepository;

@SpringBootTest
public class OrderRepositoyTests {

	@Autowired
	private OrderRepository orderRepository;
	
	@Test
	void testInsert() {
		
		Order order = new Order();
		order.setName("123");
		order.setAmount("10");
		
		orderRepository.insert(order);
		
	}
	
}

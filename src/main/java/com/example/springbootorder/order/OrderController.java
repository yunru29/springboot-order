package com.example.springbootorder.order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;



@RestController
@RequestMapping("api")  //請求的位址

public class OrderController {
//	@Autowired
////	private OrderService service;
//	
//	@PostMapping("order")
//	@ResponseBody
//	public Order order(@RequestBody Order order) {
//		return new Order(
////				order.getName(),
////				order.getAmount()	
//		);
//	}
}

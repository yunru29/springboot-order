package com.example.springbootorder.order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.type.OrderedSetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.springbootorder.service.Order;
import com.example.springbootorder.service.OrderService;





@RestController
@RequestMapping(path = {"/order"})  //請求的位址
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE)//只能接收Json
	public Map<String, Object> handleMethod(@RequestBody Order order) {//model
		System.out.println("123");
		orderService.insert(order);
		Map<String, Object> map = new HashMap<>();
		map.put("Msg", "Insert sucess");
		return map;
	}
	
}

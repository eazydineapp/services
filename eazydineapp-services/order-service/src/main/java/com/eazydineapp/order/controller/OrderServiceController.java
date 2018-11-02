package com.eazydineapp.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eazydineapp.order.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderServiceController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/")
	public String testController() {
		return "pass";
	}
	
}

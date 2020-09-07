package com.zjh.psstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjh.psstore.entity.Order;
import com.zjh.psstore.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		Order newOrder = orderService.createNewOrder(order);
		return ResponseEntity.ok(newOrder);
	}
}

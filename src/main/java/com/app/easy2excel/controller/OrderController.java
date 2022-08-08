package com.app.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.OrderDTO;
import com.app.easy2excel.entity.Order;
import com.app.easy2excel.service.OrderService;


@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping("/order")
	public ResponseEntity<Order> saveOrder(@RequestBody OrderDTO orderDTO) {
		return ResponseEntity.ok(orderService.saveOrder(orderDTO));
	}

	@GetMapping("/order/{id}")
	public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long id) {
		return ResponseEntity.ok(orderService.getOrderById(id));
	}

}

package com.rudra.orders.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rudra.orders.model.Order;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@GetMapping
	public List<Order> getOrders() {
		return new ArrayList<>();
	}
}

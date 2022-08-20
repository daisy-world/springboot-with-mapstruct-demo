package com.app.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.entity.Customer;
import com.app.easy2excel.service.CustomerService;



@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/customer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerDTO customerDTO) {
		return ResponseEntity.ok(customerService.saveCustomer(customerDTO));
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id) {
		return ResponseEntity.ok(customerService.getCustomerById(id));
	}
}

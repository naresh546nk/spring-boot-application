package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCustomer() {
		return service.getAllCustomer();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}
	
	

}

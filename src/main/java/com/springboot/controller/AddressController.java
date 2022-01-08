package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.CustomerAddress;
import com.springboot.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/add")
	public CustomerAddress addAddress(@RequestBody CustomerAddress customerAddress) {
		return addressService.addAddress(customerAddress);
	}
	
	@GetMapping("/all")
	public  List<CustomerAddress> getAllAddress(){
		return addressService.getAllAddress();
	}
	@GetMapping("/{id}")
	public CustomerAddress getCustomerAddressById(@PathVariable int id) {
		return addressService.getCustomerAddressById(id);
	}
	

}

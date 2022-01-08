package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Customer;
import com.springboot.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).get();
	}
	

}

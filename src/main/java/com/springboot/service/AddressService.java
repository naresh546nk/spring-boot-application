package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.CustomerAddress;
import com.springboot.repo.CustomerAddressRepo;

@Service
public class AddressService {
	
	@Autowired
	private CustomerAddressRepo addressRepo;

	public CustomerAddress addAddress(CustomerAddress customerAddress) {
		// TODO Auto-generated method stub
		return addressRepo.save(customerAddress);
	}

	public List<CustomerAddress> getAllAddress() {
		// TODO Auto-generated method stub
		return addressRepo.findAll();
	}

	public  CustomerAddress getCustomerAddressById(int id) {
		// TODO Auto-generated method stub
		return addressRepo.findById(id).get();
	}
	
	

}

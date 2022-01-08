package com.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String name;
	private String emailId;
	private String mobileNo;
	
	  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinTable(name = "cust_address",
        joinColumns =@JoinColumn(name = "customerId"),
        inverseJoinColumns = @JoinColumn(name = "id"))
	private  List<CustomerAddress> address;
	
	
	
	public List<CustomerAddress> getAddress() {
		return address;
	}
	public void setAddress(List<CustomerAddress> address) {
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Customer(int customerId, String name, String emailId, String mobileNo) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

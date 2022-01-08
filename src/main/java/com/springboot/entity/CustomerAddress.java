package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String address;
	private String state;
	private String city;
	private int pin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public CustomerAddress(int id, String address, String state, String city, int pin) {
		super();
		this.id = id;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pin = pin;
	}
	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

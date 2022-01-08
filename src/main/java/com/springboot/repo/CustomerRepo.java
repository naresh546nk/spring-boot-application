package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
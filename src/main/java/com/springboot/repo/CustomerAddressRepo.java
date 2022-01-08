package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.CustomerAddress;

@Repository
public interface CustomerAddressRepo  extends JpaRepository<CustomerAddress, Integer>{

}

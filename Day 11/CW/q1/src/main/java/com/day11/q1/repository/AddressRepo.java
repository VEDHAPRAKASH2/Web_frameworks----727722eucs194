package com.day11.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.q1.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{
    
}

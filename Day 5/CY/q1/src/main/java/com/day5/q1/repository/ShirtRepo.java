package com.day5.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.q1.model.Shirt;

public interface ShirtRepo extends JpaRepository<Shirt,Integer> {
   
}
package com.day5.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.q1.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
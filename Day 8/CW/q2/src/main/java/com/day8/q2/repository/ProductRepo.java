package com.day8.q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day8.q2.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
    @Query("SELECT distinct p.productName from Product p where p.productName LIKE ?1%")
    List<String> findProductByStart(String str);
    @Query("SELECT distinct p.productName from Product p where p.productName LIKE %?1")
    List<String> findProductByEnd(String str);
    @Query("SELECT p from Product p ORDER BY p.price")
    List<Product> findSorted();
}
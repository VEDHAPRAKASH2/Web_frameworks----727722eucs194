package com.day10.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.day10.q1.model.Product;

import jakarta.transaction.Transactional;

public interface ProductRepo extends JpaRepository<Product,Integer>{
    @Query("SELECT p FROM Product p WHERE p.category = ?1")
    List<Product> findByCategory(String category);

    @Modifying
    @Transactional
    @Query("UPDATE Product p SET p.quantityInStock = ?2 WHERE p.productId = ?1")
    int updateQuantity(int productId, int quantityInStock);
    
    @Modifying
    @Transactional
    @Query("DELETE FROM Product p WHERE p.productId = ?1")
    void deleteProduct(int productId);

    Product findById(int id);
}

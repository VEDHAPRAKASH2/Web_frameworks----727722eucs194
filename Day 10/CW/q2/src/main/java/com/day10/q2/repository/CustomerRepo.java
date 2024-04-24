package com.day10.q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.day10.q2.model.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    @Query("SELECT c from Customer c")
    List<Customer> getAllCustomers();
    
    @Query("SELECT c from Customer c where c.customerId = ?1")
    Customer getCustomer(int customerId);
    
    @Query("SELECT c from Customer c where c.city = ?1")
    List<Customer> getCustomersByCity(String city);

    @Modifying
    @Transactional
    @Query("UPDATE Customer c SET c.pincode = ?1 WHERE c.customerId = ?2")
    void update(int pincode, int customerId);
    
    @Modifying
    @Transactional
    @Query("DELETE from Customer c WHERE c.customerId = ?1")
    void delete(int customerId);
}

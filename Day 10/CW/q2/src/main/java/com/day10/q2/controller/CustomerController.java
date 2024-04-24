package com.day10.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day10.q2.model.Customer;
import com.day10.q2.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService ser;

    @PostMapping("/api/customer")
    public Customer post(@RequestBody Customer c)
    {
        return ser.post(c);
    }

    @GetMapping("/api/customer")
    public List<Customer> getAllCustomers()
    {
        return ser.getAll();
    }

    @GetMapping("/api/customer/{customerId}")
    public Customer getCustomer(@PathVariable int customerId)
    {
        return ser.getCustomer(customerId);
    }

    @GetMapping("/api/customer/bycity/{city}")
    public List<Customer> getCustomersByCity(@PathVariable String city)
    {
        return ser.getCustomersByCity(city);
    }

    @PutMapping("/api/customer/{customerId}/{pincode}")
    public Customer update(@PathVariable("pincode") int pincode,@PathVariable("customerId") int customerId)
    {
        return ser.update(pincode, customerId);
    }

    @DeleteMapping("/api/customer/{customerId}")
    public String delete(@PathVariable int customerId)
    {
        return ser.delete(customerId);
    }
}

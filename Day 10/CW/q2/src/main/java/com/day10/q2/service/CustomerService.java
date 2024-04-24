package com.day10.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day10.q2.model.Customer;
import com.day10.q2.repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo r;

    public Customer post(Customer c)
    {
        return r.save(c);
    }

    public List<Customer> getAll()
    {
        return r.getAllCustomers();
    }

    public Customer getCustomer(int customerId)
    {
        return r.getCustomer(customerId);
    }

    public List<Customer> getCustomersByCity(String city)
    {
        return r.getCustomersByCity(city);
    }

    public Customer update(int pincode ,int customerId)
    {
        r.update(pincode, customerId);
        return r.getCustomer(customerId);
    }

    public String delete(int customerId)
    {
        r.delete(customerId);
        return "Customer deleted successfully";
    }
}

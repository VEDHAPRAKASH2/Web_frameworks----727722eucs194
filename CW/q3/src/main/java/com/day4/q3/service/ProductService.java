package com.day4.q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.q3.model.Product;
import com.day4.q3.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo r;

    public Product putProduct(Product p)
    {
        return r.save(p);
    }

    public List<Product> getAllProduct()
    {
        return r.findAll();
    }

    public Optional<Product> getProduct(int i)
    {
        return r.findById(i);
    }
}
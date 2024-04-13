package com.day4.q3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day4.q3.model.Product;
import com.day4.q3.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService s;

    @GetMapping("/api/product")
    public List<Product> g1()
    {
        return s.getAllProduct();
    }

    @GetMapping("/api/product/{productId}")
    public Optional<Product> g2(@PathVariable int productId)
    {
        return s.getProduct(productId);
    }

    @PostMapping("/api/product/add")
    public Product p1(@RequestBody Product p)
    {
        return s.putProduct(p);
    }
}

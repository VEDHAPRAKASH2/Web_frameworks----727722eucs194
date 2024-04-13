package com.day5.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.q1.model.Product;
import com.day5.q1.service.ProductService;


@RestController
public class ProductController {
    
    @Autowired
    ProductService s;

    @PostMapping(path = "/api/product")
    public Product post(@RequestBody Product e)
    {
        return s.post(e);
    }

    @PutMapping("/api/product/{productId}")
    public Product put(Product e)
    {
        return s.put(e);
    }
    
    @DeleteMapping("/api/product/{productId}")
    public void delete(@PathVariable int productId)
    {
        s.delete(productId);
    }
}

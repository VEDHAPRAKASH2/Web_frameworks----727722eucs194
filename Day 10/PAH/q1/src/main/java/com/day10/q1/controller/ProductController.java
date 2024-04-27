package com.day10.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day10.q1.model.Product;
import com.day10.q1.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService ser;

    @PostMapping("/api/product")
    public Product post(@RequestBody Product p)
    {
        return ser.post(p);
    }

    @GetMapping("/api/product/bycategory/{category}")
    public List<Product> get(@PathVariable String category)
    {
        return ser.get(category);
    }

    @PutMapping("/api/product/{productId}/{quantityInStock}")
    public Product updateProduct(@PathVariable int productId,@PathVariable int quantityInStock)
    {
        return ser.updateQuantity(productId, quantityInStock);
    }

    @DeleteMapping("/api/product/{productId}")
    public String delete(@PathVariable int productId)
    {
        return ser.deleteProduct(productId);
    }
}
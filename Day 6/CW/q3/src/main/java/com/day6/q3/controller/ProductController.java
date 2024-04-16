package com.day6.q3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day6.q3.model.Product;
import com.day6.q3.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService ser;

    @PostMapping("/api/product")
    public Product post(@RequestBody Product p)
    {
        return ser.post(p);
    }

    @GetMapping("/api/product/{productId}")
    public Optional<Product> get(@PathVariable int productId)
    {
        return ser.get(productId);
    }

    @GetMapping("/api/product/{offset}/{pagesize}")
    public List<Product> get(@PathVariable("offset") int offset,@PathVariable("pagesize") int pageSize)
    {
        return ser.getPage(offset, pageSize);
    }

    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public List<Product> get(@PathVariable("offset") int offset,@PathVariable("pagesize") int pageSize,@PathVariable String field)
    {
        return ser.getPage(offset, pageSize, field);
    }
}

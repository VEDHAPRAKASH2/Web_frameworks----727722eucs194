package com.day8.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day8.q2.model.Product;
import com.day8.q2.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService ser;

    @PostMapping("/product")
    public Product post(@RequestBody Product p)
    {
        return ser.post(p);
    }

    @GetMapping("/product/distinct/startwith/{name}")
    public List<String> getByStart(@PathVariable String name)
    {
        return ser.getByStart(name);
    }
    
    @GetMapping("/product/distinct/endwith/{name}")
    public List<String> getByEnd(@PathVariable String name)
    {
        return ser.getByEnd(name);
    }

    @GetMapping("/product/sortBy/price")
    public List<Product> getSorted()
    {
        return ser.getBySorted();
    }
}

package com.day10.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day10.q1.model.Product;
import com.day10.q1.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo r;

    public Product post(Product p)
    {
        return r.save(p);
    }

    public List<Product> get(String category)
    {
        return r.findByCategory(category);
    }

    public Product updateQuantity(int productId,int quantityInStock)
    {
        r.updateQuantity(productId, quantityInStock);
        return r.findById(productId);
    }

    public String deleteProduct(int productId)
    {
        r.deleteProduct(productId);
        return "Product deleted successfully";
    }
}

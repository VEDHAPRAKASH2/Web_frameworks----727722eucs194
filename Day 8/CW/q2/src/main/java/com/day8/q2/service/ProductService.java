package com.day8.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day8.q2.model.Product;
import com.day8.q2.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo r;

    public Product post(Product p)
    {
        return r.save(p);
    }

    public List<String> getByStart(String str)
    {
        return r.findProductByStart(str);
    }

    public List<String> getByEnd(String str)
    {
        return r.findProductByEnd(str);
    }

    public List<Product> getBySorted()
    {
        return r.findSorted();
    }
}

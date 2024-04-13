package com.day5.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.q1.model.Product;
import com.day5.q1.repository.ProductRepo;


@Service
public class ProductService {

    @Autowired
    ProductRepo r;

    public Product post(Product e)
    {
        return r.save(e);
    }

    public Product put(Product e)
    {
        return r.save(e);
    }

    public void delete(int i)
    {
        r.deleteById(i);
    }
}
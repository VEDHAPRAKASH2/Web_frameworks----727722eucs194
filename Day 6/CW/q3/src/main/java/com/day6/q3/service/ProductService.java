package com.day6.q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.q3.model.Product;
import com.day6.q3.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo r;

    public Product post(Product p)
    {
        return r.save(p);
    }

    public Optional<Product> get(int i)
    {
        return r.findById(i);
    }

    public List<Product> getPage(int offset,int pageSize)
    {
        return r.findAll(PageRequest.of(offset, pageSize)).getContent();
    }

    public List<Product> getPage(int offset,int pageSize,String field)
    {
        return r.findAll(PageRequest.of(offset, pageSize, Sort.by(field))).getContent();
    }
}

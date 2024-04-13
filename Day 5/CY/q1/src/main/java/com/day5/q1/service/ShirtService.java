package com.day5.q1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.q1.model.Shirt;
import com.day5.q1.repository.ShirtRepo;

@Service
public class ShirtService {
    @Autowired
    ShirtRepo r;

    public List<Shirt> getAll()
    {
        return r.findAll();
    }

    public Optional<Shirt> get(int i)
    {
        return r.findById(i);
    }

    public Shirt put(Shirt s)
    {
        return r.save(s);
    }

    public Shirt update(Shirt s)
    {
        return r.save(s);
    }

    public void delete(int i)
    {
        r.deleteById(i);
    }
}

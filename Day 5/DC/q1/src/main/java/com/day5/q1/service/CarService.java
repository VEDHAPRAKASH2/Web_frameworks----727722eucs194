package com.day5.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.q1.model.Contact;
import com.day5.q1.repository.CarRepo;

@Service
public class CarService {
    
    @Autowired
    CarRepo r;

    public Contact put(Contact c)
    {
        return r.save(c);
    }

    public Contact update(Contact c)
    {
        return r.save(c);
    }

    public void delete(int i)
    {
        r.deleteById(i);
    }
}

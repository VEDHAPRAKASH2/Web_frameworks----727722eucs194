package com.day12.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.day12.q1.model.Address;
import com.day12.q1.model.Employee;
import com.day12.q1.repository.EmployeeRepo;

@Service
public class AddressService {

    @Autowired
    EmployeeRepo r;

    public Address postAddress(@RequestBody Address a,int id)
    {
        Employee e = r.findById(id);
        e.setAddress(a);
        r.save(e);
        return a;
    }
}

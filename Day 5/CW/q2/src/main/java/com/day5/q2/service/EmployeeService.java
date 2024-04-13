package com.day5.q2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.q2.model.Employee;
import com.day5.q2.repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo r;

    public Employee post(Employee e)
    {
        return r.save(e);
    }

    public Employee put(Employee e)
    {
        return r.save(e);
    }

    public void delete(int i)
    {
        r.deleteById(i);
    }
}
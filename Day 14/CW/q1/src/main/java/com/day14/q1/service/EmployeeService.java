package com.day14.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day14.q1.model.Employee;
import com.day14.q1.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo r;

    public Employee post(Employee e)
    {
        return r.save(e);
    }

    public List<Employee> getAll()
    {
        return r.findAll();
    }

    public Employee get(int employeeId)
    {
        return r.findById(employeeId);
    }
}

package com.day6.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.q1.model.Employee;
import com.day6.q1.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo r;

    public Employee post(Employee e)
    {
        return r.save(e);
    }

    public List<Employee> getSort(String field)
    {
        return r.findAll(PageRequest.of(0, r.findAll().size(), Sort.by(field))).getContent();
    }

    public List<Employee> get(int offset, int pagesize)
    {
        return r.findAll(PageRequest.of(offset, pagesize)).getContent();
    }

    public List<Employee> get(int offset, int pagesize, String field)
    {
        return r.findAll(PageRequest.of(offset, pagesize, Sort.by(field))).getContent();
    }
}

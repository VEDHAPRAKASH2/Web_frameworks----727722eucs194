package com.day13.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day13.q2.model.Department;
import com.day13.q2.repository.DepartmentRepo;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepo r;

    public Department post(Department d)
    {
        return r.save(d);
    }

    public List<Department> getAll()
    {
        return r.findAll();
    }
}

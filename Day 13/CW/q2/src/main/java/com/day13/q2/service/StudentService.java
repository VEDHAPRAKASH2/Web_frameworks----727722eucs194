package com.day13.q2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day13.q2.model.Student;
import com.day13.q2.repository.DepartmentRepo;
import com.day13.q2.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo sr;
    @Autowired
    DepartmentRepo dr;

    public Student post(Student s,int departmentId)
    {
        s.setDepartment(dr.findById(departmentId));
        return sr.save(s);
    }
    
    public List<Student> getAll()
    {
        return sr.findAll();
    }
    
    public Student getAll(int studentId)
    {
        return sr.findById(studentId);
    }

    public List<Student> getById(int departmentId)
    {
        List<Student> arr = new ArrayList<>();
        List<Student> res = sr.findAll();

        for(int i=0;i<res.size();i++)
        {
            if(res.get(i).getDepartment().getDepartmentId()==departmentId)
            arr.add(res.get(i));
        }

        return arr;
    }
}

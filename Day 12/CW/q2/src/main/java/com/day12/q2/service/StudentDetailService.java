package com.day12.q2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day12.q2.model.Student;
import com.day12.q2.model.StudentDetail;
import com.day12.q2.repository.StudentDetailRepo;
import com.day12.q2.repository.StudentRepo;

@Service
public class StudentDetailService {
    @Autowired
    StudentDetailRepo r;
    @Autowired
    StudentRepo rep;

    public StudentDetail post(StudentDetail s,int id)
    {
        Student stu = rep.findById(id); 
        stu.setStudentDetail(s);
        rep.save(stu);
        return s;
    }
}
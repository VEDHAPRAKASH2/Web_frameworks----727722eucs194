package com.day8.q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day8.q3.model.Student;
import com.day8.q3.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo r;    

    public Student post(Student s)
    {
        return r.save(s);
    }

    public List<Student> findAllByGreater(int mark)
    {
        return r.findAllByGreater(mark);
    }

    public List<Student> findAllByLesser(int mark)
    {
        return r.findAllByLesser(mark);
    }
}

package com.day5.q1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.q1.model.Student;
import com.day5.q1.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo r;

    public List<Student> getAllStudents()
    {
        return r.findAll();
    }

    public Optional<Student> getStudent(int i)
    {
        return r.findById(i);
    }

    public Student putStudent(Student s)
    {
        return r.save(s);
    }
    
    public Student updateStudent(Student s)
    {
        return r.save(s);
    }

    public void deleteStudent(int i)
    {
        r.deleteById(i);
    }
}

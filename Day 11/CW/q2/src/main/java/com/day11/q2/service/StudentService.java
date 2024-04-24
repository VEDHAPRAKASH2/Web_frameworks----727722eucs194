package com.day11.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day11.q2.model.Student;
import com.day11.q2.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository r;

    public Student post(Student s)
    {
        return r.save(s);
    }

    public List<Student> getAll()
    {
        return r.findAll();
    }

    public Student get(int i)
    {
        return r.findById(i);
    }

    public Student update(int id,Student s)
    {
        Student stu = r.findById(id);
        stu.setName(s.getName());
        stu.setStudentIDCard(s.getStudentIDCard());
        return r.save(stu);
    }

    public String delete(int id)
    {
        if(r.existsById(id))
        {
            r.deleteById(id);
            return "Deleted Student Successfully";
        }

        return "Student with ID "+id+" not found";
    }
}

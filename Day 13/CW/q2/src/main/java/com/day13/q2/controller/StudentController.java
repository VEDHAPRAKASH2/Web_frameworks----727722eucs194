package com.day13.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day13.q2.model.Student;
import com.day13.q2.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService ser;
    
    @PostMapping("/department/{departmentId}/student")
    public Student post(@RequestBody Student s,@PathVariable int departmentId)
    {
        return ser.post(s,departmentId);
    }
    
    @GetMapping("/department/student")
    public List<Student> getAll()
    {
        return ser.getAll();
    }
    
    @GetMapping("/department/student/{studentId}")
    public Student get(@PathVariable int studentId)
    {
        return ser.getAll(studentId);
    }
    
    @GetMapping("/department/{departmentId}/student")
    public List<Student> getDep(@PathVariable int departmentId)
    {
        return ser.getById(departmentId);
    }
}

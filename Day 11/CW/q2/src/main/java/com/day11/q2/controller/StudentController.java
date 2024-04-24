package com.day11.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day11.q2.model.Student;
import com.day11.q2.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService ser;

    @PostMapping("/student")
    public Student post(@RequestBody Student s)
    {
        return ser.post(s);
    }

    @GetMapping("/student")
    public List<Student> getAll()
    {
        return ser.getAll();
    }
    
    @GetMapping("/student/{id}")
    public Student get(@PathVariable int id)
    {
        return ser.get(id);
    }
    
    @PutMapping("/student/{id}")
    public Student update(@RequestBody Student s,@PathVariable int id)
    {
        return ser.update(id, s);
    }

    @DeleteMapping("/student/{id}")
    public String delete(@PathVariable int id)
    {
        return ser.delete(id);
    }
}

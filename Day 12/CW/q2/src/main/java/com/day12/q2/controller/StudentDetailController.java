package com.day12.q2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day12.q2.model.StudentDetail;
import com.day12.q2.service.StudentDetailService;

@RestController
public class StudentDetailController {
    @Autowired
    StudentDetailService ser;

    @PutMapping("/studentDetail/student/{id}")
    public StudentDetail post(@RequestBody StudentDetail s,@PathVariable int id)
    {
        return ser.post(s, id);
    }
}

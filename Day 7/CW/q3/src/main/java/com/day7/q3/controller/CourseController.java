package com.day7.q3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day7.q3.model.Door;
import com.day7.q3.service.DoorService;


@RestController
public class CourseController {
    @Autowired
    DoorService ser;

    @PostMapping("/api/door")
    public Door post(@RequestBody Door d)
    {
        return ser.post(d);
    }

    @GetMapping("/api/door")
    public List<Door> get()
    {
        return ser.get();
    }

    @GetMapping("/api/door/{doorId}")
    public Door get(@PathVariable int doorId)
    {
        return ser.get(doorId);
    }

    @GetMapping("/api/door/accesstype/{accessType}")
    public List<Door> get(@PathVariable String accessType)
    {
        return ser.get(accessType);
    }
}
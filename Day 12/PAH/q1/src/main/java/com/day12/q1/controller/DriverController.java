package com.day12.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day12.q1.model.Driver;
import com.day12.q1.service.DriverService;

@RestController
public class DriverController {
    @Autowired
    DriverService ser;

    @PostMapping("/driver")
    public Driver post(@RequestBody Driver d)
    {
        return ser.post(d);
    }

    @GetMapping("/driver")
    public List<Driver> getAllDrivers()
    {
        return ser.getAllDriver();
    }
    
    @GetMapping("/driver/{id}")
    public Driver getDriver(@PathVariable int id)
    {
        return ser.getDriver(id);
    }

    @PutMapping("/driver/{id}")
    public Driver getDriver(@RequestBody Driver d,@PathVariable int id)
    {
        return ser.updateDriver(d,id);
    }

    @GetMapping("/driver-left-join")
    public List<Driver> leftjoin()
    {
        return ser.leftjoin();
    }
}

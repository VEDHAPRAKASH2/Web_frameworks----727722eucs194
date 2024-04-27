package com.day7.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day7.q1.model.Car;
import com.day7.q1.service.CarService;

@RestController
public class CarController {
    @Autowired
    CarService ser;

    @PostMapping("/api/car")
    public Car post(@RequestBody Car c)
    {
        return ser.post(c);
    }

    @GetMapping("/api/car")
    public List<Car> getAllCars()
    {
        return ser.getAllCars();
    }
    
    @GetMapping("/api/car/distinct")
    public Car getByAddressAndOwner(@RequestParam String address,@RequestParam String owner)
    {
        return ser.getByAddressAndOwner(address,owner);
    }
}

package com.day5.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day5.q1.model.Contact;
import com.day5.q1.service.CarService;

@RestController
public class CarController {
    @Autowired
    CarService s;

    @PostMapping(path = "/car")
    public Contact post(@RequestBody Contact c)
    {
        return s.put(c);
    }

    @PutMapping("/car/{carId}")
    public Contact update(@RequestBody Contact c)
    {
        return s.update(c);
    }

    @DeleteMapping("/car/{carId}")
    public void delete(@PathVariable int carId)
    {
        s.delete(carId);
    }
}

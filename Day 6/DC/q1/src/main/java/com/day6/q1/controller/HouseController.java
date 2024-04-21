package com.day6.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day6.q1.service.HouseService;
import com.day6.q1.model.House;

@RestController
public class HouseController {

    @Autowired
    HouseService ser;

    @PostMapping("/api/house")
    public House post(@RequestBody House h)
    {
        return ser.post(h);
    }

    @GetMapping("/api/house/{offset}/{pagesize}")
    public List<House> get(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize)
    {
        return ser.get(offset, pagesize);
    }

    @GetMapping("/api/house/{offset}/{pagesize}/{field}")
    public List<House> get(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable("field") String field)
    {
        return ser.get(offset, pagesize, field);
    }
}

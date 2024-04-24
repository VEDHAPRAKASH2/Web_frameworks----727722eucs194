package com.day10.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day10.q1.model.Door;
import com.day10.q1.service.DoorService;

@RestController
public class DoorController {
    @Autowired
    DoorService ser;

    @PostMapping("/api/door")
    public Door post(@RequestBody Door d)
    {
        return ser.post(d);
    }

    @PutMapping("/api/door/{doorId}")
    public Door put(@RequestParam String color,@PathVariable int doorId)
    {
        return ser.put(doorId,color);
    }

    @DeleteMapping("/api/door/{doorId}")
    public String delete(@PathVariable int doorId)
    {
        return ser.delete(doorId);
    }

    @GetMapping("/api/door")
    public List<Door> getAll()
    {
        return ser.getAll();
    }

    @GetMapping("/api/door/bycolor/{color}")
    public List<Door> getByColor(@PathVariable String color)
    {
        return ser.getByColor(color);
    }
    
    @GetMapping("/api/door/{doorId}")
    public Door getByColor(@PathVariable int doorId)
    {
        return ser.getById(doorId);
    }

    @GetMapping("/api/door/bydoortype")
    public List<Door> getByType(@RequestParam String doorType)
    {
        return ser.getByType(doorType);
    }

}

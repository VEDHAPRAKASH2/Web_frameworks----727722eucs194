package com.day5.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.q1.model.Shirt;
import com.day5.q1.service.ShirtService;

@RestController
public class ShirtController {

    @Autowired
    ShirtService s;

    @GetMapping("/shirt")
    public List<Shirt> getAll()
    {
        return s.getAll();
    }

    @GetMapping("/shirt/{shirtId}")
    public Optional<Shirt> get(@PathVariable int shirtId)
    {
        return s.get(shirtId);
    }

    @PostMapping(path = "/shirt")
    public Shirt put(@RequestBody Shirt sh)
    {
        return s.put(sh);
    }

    @PutMapping("/shirt/{shirtId}")
    public Shirt update(@RequestBody Shirt sh)
    {
        return s.put(sh);
    }

    @DeleteMapping("/shirt/{shirtId}")
    public void delete(@PathVariable int shirtId)
    {
        s.delete(shirtId);
    }
}

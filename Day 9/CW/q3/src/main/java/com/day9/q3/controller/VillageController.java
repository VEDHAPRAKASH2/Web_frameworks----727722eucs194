package com.day9.q3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day9.q3.model.Village;
import com.day9.q3.service.VillageService;

@RestController
public class VillageController {
    @Autowired
    VillageService ser;

    @PostMapping("/api/village")
    public Village post(@RequestBody Village v)
    {
        return ser.post(v);
    }
    
    @GetMapping("/api/village/byname/{villageName}")
    public Village getByName(@PathVariable String villageName)
    {
        return ser.getByName(villageName);
    }

    @GetMapping("/api/village/bypopulation/{villagePopulation}")
    public List<Village> getByPopulation(@PathVariable int villagePopulation)
    {
        return ser.getByPopulation(villagePopulation);
    }

    @GetMapping("/api/village/{villageId}")
    public Village getById(@PathVariable int villageId)
    {
        return ser.getById(villageId);
    }    
}

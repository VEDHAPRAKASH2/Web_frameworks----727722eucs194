package com.day4.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day4.q1.model.Medicine;
import com.day4.q1.service.MedicineService;

@RestController
public class MedicineController {

    @Autowired
    MedicineService service;

    @PostMapping(path = "/api/medicine")
    public Medicine p1(@RequestBody Medicine m)
    {
        return service.putMedicine(m);
    }
    
    @GetMapping("/api/medicines")
    public List<Medicine> g1()
    {
        return service.getAllMedicines();
    }

    @GetMapping("/api/medicine/{medicineId}")
    public Optional<Medicine> g2(@PathVariable int medicineId)
    {
        return service.getMedicine(medicineId);
    }
}

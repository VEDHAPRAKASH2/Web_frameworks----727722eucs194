package com.day12.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day12.q1.model.Driver;
import com.day12.q1.model.License;
import com.day12.q1.service.LicenseService;

@RestController
public class LicenseController {
    @Autowired
    LicenseService ser;

    @PostMapping("/license/driver/{id}")
    public Driver post(@RequestBody License l,@PathVariable int id)
    {
        return ser.post(l, id);
    }
}

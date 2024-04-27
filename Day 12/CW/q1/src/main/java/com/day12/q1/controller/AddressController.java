package com.day12.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day12.q1.model.Address;
import com.day12.q1.service.AddressService;

@RestController
public class AddressController {
    @Autowired
    AddressService ser;

    @PostMapping("/address/employee/{id}")
    public Address postAddress(@RequestBody Address a,@PathVariable int id)
    {
        return ser.postAddress(a, id);
    }
}

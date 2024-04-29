package com.day14.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day14.q1.model.Payroll;
import com.day14.q1.service.PayrollService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PayrollController {
    @Autowired
    PayrollService ser;

    // @Tag(name="Payroll Controller",description = "all controller")
    @PostMapping("/employee/{employeeId}/payroll")
    public Payroll post(@RequestBody Payroll p,@PathVariable int employeeId)
    {
        return ser.post(p, employeeId);
    }
    
    @GetMapping("/employee/{employeeId}/payroll")
    public Payroll get(@PathVariable int employeeId)
    {
        return ser.get(employeeId);
    }
}

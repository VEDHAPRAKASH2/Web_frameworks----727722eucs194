package com.day14.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day14.q1.model.Employee;
import com.day14.q1.model.Payroll;
import com.day14.q1.repository.EmployeeRepo;
import com.day14.q1.repository.PayrollRepo;

@Service
public class PayrollService {
    @Autowired
    PayrollRepo r;
    @Autowired
    EmployeeRepo er;
   
    public Payroll post(Payroll p,int employeeId)
    {
        Employee employee = er.findById(employeeId);
        employee.setPayroll(p);
        er.save(employee);
        return p;
    }

    public Payroll get(int employeeId)
    {
        return er.findById(employeeId).getPayroll();
    }
}

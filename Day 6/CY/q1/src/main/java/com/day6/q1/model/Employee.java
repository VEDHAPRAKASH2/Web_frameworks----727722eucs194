package com.day6.q1.model;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employeeId;

    String employeeName,employeeEmail,employeeMobile;

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
    }

    public Employee(int employeeId, String employeeName, String employeeEmail, String employeeMobile) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeMobile = employeeMobile;
    }

    
}

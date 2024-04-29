package com.day14.q1.model;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int employeeId;

    String employeeString;

    int age;

    long mobile;

    @OneToOne(cascade = CascadeType.ALL)
    Payroll payroll;

    public Employee() {
    }

    public Employee(int employeeId, String employeeString, int age, long mobile, Payroll payroll) {
        this.employeeId = employeeId;
        this.employeeString = employeeString;
        this.age = age;
        this.mobile = mobile;
        this.payroll = payroll;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeString() {
        return employeeString;
    }

    public void setEmployeeString(String employeeString) {
        this.employeeString = employeeString;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Payroll getPayroll() {
        return payroll;
    }

    public void setPayroll(Payroll payroll) {
        this.payroll = payroll;
    }
}

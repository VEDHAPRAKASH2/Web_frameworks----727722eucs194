package com.day14.q1.model;

import jakarta.persistence.*;

@Entity
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int payrollId;

    double amount;

    int noOfDaysWorked;

    public Payroll() {
    }

    public Payroll(int payrollId, double amount, int noOfDaysWorked) {
        this.payrollId = payrollId;
        this.amount = amount;
        this.noOfDaysWorked = noOfDaysWorked;
    }

    public int getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }

    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }
}

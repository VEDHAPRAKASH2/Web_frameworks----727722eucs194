package com.day13.q2.model;

import jakarta.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int departmentId;

    String departmentName,departmentEmail,headOfDepartment;

    public Department() {
        
    }
    
    public Department(int departmentId, String departmentName, String departmentEmail, String headOfDepartment) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentEmail = departmentEmail;
        this.headOfDepartment = headOfDepartment;
    }
    
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentEmail() {
        return departmentEmail;
    }

    public void setDepartmentEmail(String departmentEmail) {
        this.departmentEmail = departmentEmail;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }
}

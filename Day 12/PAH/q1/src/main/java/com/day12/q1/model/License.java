package com.day12.q1.model;

import jakarta.persistence.*;

@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String licenseNumber,category;

    public License() {
    }

    public License(int id, String licenseNumber, String category) {
        this.id = id;
        this.licenseNumber = licenseNumber;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

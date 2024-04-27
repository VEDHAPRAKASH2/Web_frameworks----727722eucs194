package com.day12.q1.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String city,street;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
    Employee employee;

    public Address() {
    }

    public Address(int id, String city, String street) {
        this.id = id;
        this.city = city;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

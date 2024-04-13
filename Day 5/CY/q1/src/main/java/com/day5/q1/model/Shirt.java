package com.day5.q1.model;

import jakarta.persistence.*;

@Entity
public class Shirt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int shirtId;

    String shirtName,shirtColor;

    public Shirt(int shirtId, String shirtName, String shirtColor) {
        this.shirtId = shirtId;
        this.shirtName = shirtName;
        this.shirtColor = shirtColor;
    }

    public Shirt() {
    }

    public int getShirtId() {
        return shirtId;
    }

    public void setShirtId(int shirtId) {
        this.shirtId = shirtId;
    }

    public String getShirtName() {
        return shirtName;
    }

    public void setShirtName(String shirtName) {
        this.shirtName = shirtName;
    }

    public String getShirtColor() {
        return shirtColor;
    }

    public void setShirtColor(String shirtColor) {
        this.shirtColor = shirtColor;
    }

    
}

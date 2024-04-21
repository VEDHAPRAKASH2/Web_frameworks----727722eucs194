package com.day6.q1.model;

import jakarta.persistence.*;

@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int houseId;

    String houseColor,houseTotalSqft,houseNumOfBHK,houseLocation;

    public House() {
    }

    public House(int houseId, String houseColor, String houseTotalSqft, String houseNumOfBHK, String houseLocation) {
        this.houseId = houseId;
        this.houseColor = houseColor;
        this.houseTotalSqft = houseTotalSqft;
        this.houseNumOfBHK = houseNumOfBHK;
        this.houseLocation = houseLocation;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    public String getHouseTotalSqft() {
        return houseTotalSqft;
    }

    public void setHouseTotalSqft(String houseTotalSqft) {
        this.houseTotalSqft = houseTotalSqft;
    }

    public String getHouseNumOfBHK() {
        return houseNumOfBHK;
    }

    public void setHouseNumOfBHK(String houseNumOfBHK) {
        this.houseNumOfBHK = houseNumOfBHK;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }
}

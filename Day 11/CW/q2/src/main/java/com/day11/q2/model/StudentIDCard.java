package com.day11.q2.model;

import jakarta.persistence.*;

@Entity
public class StudentIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String cardNumber;

    public StudentIDCard() {
    }

    public StudentIDCard(long id, String cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    
}

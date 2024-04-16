package com.day6.q1.model;

import jakarta.persistence.*;

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    int languageId;

    int languageCode;

    String languageName,country;

    public Language() {
    }

    public Language(int languageId, int languageCode, String languageName, String country) {
        this.languageId = languageId;
        this.languageCode = languageCode;
        this.languageName = languageName;
        this.country = country;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(int languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
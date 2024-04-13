package com.day4.q4.model;

import jakarta.persistence.*;

@Entity
public class Patient {
    @Id
    int patientId;
    String patientName,doctorName,disease,medication;
    public Patient() {}
    public Patient(int patientId, String patientName, String doctorName, String disease, String medication) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.disease = disease;
        this.medication = medication;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getMedication() {
        return medication;
    }
    public void setMedication(String medication) {
        this.medication = medication;
    }
    
}

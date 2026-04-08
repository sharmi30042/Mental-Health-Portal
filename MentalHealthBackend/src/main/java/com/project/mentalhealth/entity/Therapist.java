package com.project.mentalhealth.entity;

import jakarta.persistence.*;

@Entity
public class Therapist {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization; // [cite: 27]
    private String availability;
    private String language;

    // Standard Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public String getAvailability() { return availability; }
    public void setAvailability(String availability) { this.availability = availability; }
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
}
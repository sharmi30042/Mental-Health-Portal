package com.project.mentalhealth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Assessment {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // PHQ-9 or GAD-7 [cite: 27]
    private int score;
    private String severity; // [cite: 27]
    private LocalDateTime createdAt = LocalDateTime.now();

    // Standard Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
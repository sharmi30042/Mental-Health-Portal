package com.project.mentalhealth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long therapistId;
    private Long userId;
    private LocalDateTime sessionTime;
    @Column(length = 2000)
    private String encryptedNotes;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getTherapistId() { return therapistId; }
    public void setTherapistId(Long therapistId) { this.therapistId = therapistId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public LocalDateTime getSessionTime() { return sessionTime; }
    public void setSessionTime(LocalDateTime sessionTime) { this.sessionTime = sessionTime; }
    public String getEncryptedNotes() { return encryptedNotes; }
    public void setEncryptedNotes(String encryptedNotes) { this.encryptedNotes = encryptedNotes; }
}
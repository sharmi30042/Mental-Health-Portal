package com.project.mentalhealth.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class MoodLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private int moodScore; // 1-10 scale for trend charts [cite: 27]
    private String note;
    private LocalDate logDate = LocalDate.now();

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public int getMoodScore() { return moodScore; }
    public void setMoodScore(int moodScore) { this.moodScore = moodScore; }
    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
    public LocalDate getLogDate() { return logDate; }
    public void setLogDate(LocalDate logDate) { this.logDate = logDate; }
}
package com.project.mentalhealth.service;

import org.springframework.stereotype.Service;

@Service
public class ScoringService {
    // PHQ-9 / GAD-l7 Scoring algorithm [cite: 16]
    public String calculateSeverity(String type, int score) {
        if (type.equalsIgnoreCase("PHQ-9")) {
            if (score <= 4) return "None-minimal";
            if (score <= 9) return "Mild";
            if (score <= 14) return "Moderate";
            if (score <= 19) return "Moderately Severe";
            return "Severe";
        } else { // GAD-7 [cite: 16]
            if (score <= 4) return "Minimal Anxiety";
            if (score <= 9) return "Mild Anxiety";
            if (score <= 14) return "Moderate Anxiety";
            return "Severe Anxiety";
        }
    }
}
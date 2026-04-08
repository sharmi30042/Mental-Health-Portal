package com.project.mentalhealth.controller;

import com.project.mentalhealth.entity.Assessment;
import com.project.mentalhealth.repository.AssessmentRepository;
import com.project.mentalhealth.service.ScoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController 
@RequestMapping("/api/assessments")
public class AssessmentController {
    
    @Autowired 
    private ScoringService scoringService;
    
    @Autowired 
    private AssessmentRepository repository;

    @PostMapping("/submit")
    public Assessment submitAssessment(@RequestBody Assessment assessment) {
        // Calculate severity based on score and type [cite: 27]
        String severity = scoringService.calculateSeverity(assessment.getType(), assessment.getScore());
        assessment.setSeverity(severity);
        return repository.save(assessment);
    }
}
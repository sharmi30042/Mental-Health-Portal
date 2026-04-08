package com.project.mentalhealth.controller;

import com.project.mentalhealth.entity.Therapist;
import com.project.mentalhealth.repository.TherapistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController @RequestMapping("/api/therapists")
public class TherapistController {
    @Autowired private TherapistRepository repository;

    @GetMapping
    public List<Therapist> getAll(@RequestParam(required = false) String specialization) {
        if (specialization != null) {
            return repository.findBySpecialization(specialization); // [cite: 27]
        }
        return repository.findAll();
    }
    
    @PostMapping
    public Therapist addTherapist(@RequestBody Therapist therapist) {
        return repository.save(therapist);
    }
}
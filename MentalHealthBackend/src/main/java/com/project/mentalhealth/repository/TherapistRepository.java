package com.project.mentalhealth.repository;

import com.project.mentalhealth.entity.Therapist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TherapistRepository extends JpaRepository<Therapist, Long> {
    // Filter by specialization as per requirements [cite: 27]
    List<Therapist> findBySpecialization(String specialization);
}
package com.project.mentalhealth.repository;

import com.project.mentalhealth.entity.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Assessment entity.
 * JpaRepository provides standard CRUD operations for MySQL.
 */
@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
    // This interface allows you to save scores without PII for anonymous sessions.
}
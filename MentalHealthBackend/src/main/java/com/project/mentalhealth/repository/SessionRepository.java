package com.project.mentalhealth.repository;

import com.project.mentalhealth.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;

public interface SessionRepository extends JpaRepository<Session, Long> {
    // Slot conflict validation logic [cite: 27]
    boolean existsByTherapistIdAndSessionTime(Long therapistId, LocalDateTime sessionTime);
}
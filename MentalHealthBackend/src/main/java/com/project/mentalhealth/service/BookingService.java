package com.project.mentalhealth.service;

import com.project.mentalhealth.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class BookingService {
    @Autowired private SessionRepository sessionRepo;

    public boolean validateBooking(Long therapistId, LocalDateTime time) {
        // Returns true if no conflict exists [cite: 22, 27]
        return !sessionRepo.existsByTherapistIdAndSessionTime(therapistId, time);
    }
}
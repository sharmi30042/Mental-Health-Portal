package com.project.mentalhealth.controller;

import com.project.mentalhealth.entity.Session;
import com.project.mentalhealth.repository.SessionRepository;
import com.project.mentalhealth.service.BookingService;
import com.project.mentalhealth.service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private SessionRepository sessionRepo;
    @Autowired
    private EncryptionService encryptionService;

    @PostMapping
    public ResponseEntity<?> bookSession(@RequestBody Session session) {
        // Use the manual getter session.getTherapistId()
        if (bookingService.validateBooking(session.getTherapistId(), session.getSessionTime())) {
            // Requirement: Encrypt sensitive therapist notes [cite: 27]
            if (session.getEncryptedNotes() != null) {
                session.setEncryptedNotes(encryptionService.encrypt(session.getEncryptedNotes()));
            }
            return ResponseEntity.ok(sessionRepo.save(session));
        }
        return ResponseEntity.badRequest().body("Slot conflict: Therapist is already booked at this time.");
    }
}
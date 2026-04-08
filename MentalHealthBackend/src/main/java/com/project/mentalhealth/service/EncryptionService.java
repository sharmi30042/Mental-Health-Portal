package com.project.mentalhealth.service;

import org.springframework.stereotype.Service;
import java.util.Base64;

@Service
public class EncryptionService {
    // Simple Base64 for your prototype, can be upgraded to AES later [cite: 16]
    public String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}
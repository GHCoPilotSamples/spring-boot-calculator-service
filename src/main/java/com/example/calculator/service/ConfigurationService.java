package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {
    public int getThreshold() {
        return 10; // Example threshold value
    }
}

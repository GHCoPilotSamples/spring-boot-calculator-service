package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceRepeatedTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @RepeatedTest(5)
    public void testAddRepeated() {
        assertEquals(10, calculatorService.add(5, 5));
    }
    
}
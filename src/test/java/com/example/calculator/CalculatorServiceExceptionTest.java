package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.calculator.service.CalculatorService;

public class CalculatorServiceExceptionTest {

private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));
    }

    @Test
    public void testInvalidFibonacciSeries() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.generateFibonacciSeries(-2));
    }


}

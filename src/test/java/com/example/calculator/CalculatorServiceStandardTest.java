package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;


//Write Junit test cases to test all the methods of the CalculatorService class
public class CalculatorServiceStandardTest {

    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAdd() {
        assertEquals(10, calculatorService.add(5, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculatorService.subtract(10, 5));  
    }

    @Test
    public void testMultiply() {
        assertEquals(25, calculatorService.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculatorService.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));
    }

    @Test
    public void testSquare() {
        assertEquals(25, calculatorService.square(5));
    }

    @Test
    public void testGenerateFibonacciSeries() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual = calculatorService.generateFibonacciSeries(10);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
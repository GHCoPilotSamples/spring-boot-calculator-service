package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceNestedTest {

    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Nested
    class AdditionTests {
        @Test
        public void testAddPositiveNumbers() {
            assertEquals(10, calculatorService.add(5, 5));
        }

        @Test
        public void testAddNegativeNumbers() {
            assertEquals(-10, calculatorService.add(-5, -5));
        }
    }

    @Nested
    class SubtractionTests {
        @Test
        public void testSubtractPositiveNumbers() {
            assertEquals(5, calculatorService.subtract(10, 5));
        }

        @Test
        public void testSubtractNegativeNumbers() {
            assertEquals(0, calculatorService.subtract(-5, -5));
        }
    }

    @Nested
    class MultiplicationTests {
        @Test
        public void testMultiplyPositiveNumbers() {
            assertEquals(25, calculatorService.multiply(5, 5));
        }

        @Test
        public void testMultiplyNegativeNumbers() {
            assertEquals(25, calculatorService.multiply(-5, -5));
        }
    }

    @Nested
    class DivisionTests {
        @Test
        public void testDividePositiveNumbers() {
            assertEquals(2, calculatorService.divide(10, 5));
        }

        @Test
        public void testDivideByZero() {
            assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));
        }
    }

    @Nested
    class FibonacciTests {
        @Test
        public void testGenerateFibonacciSeries() {
            int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
            int[] actual = calculatorService.generateFibonacciSeries(10);
            for (int i = 0; i < expected.length; i++) {
                assertEquals(expected[i], actual[i]);
            }
        }

        @Test
        public void testInvalidFibonacciSeries() {
            assertThrows(IllegalArgumentException.class, () -> calculatorService.generateFibonacciSeries(-2));
        }
    }
}

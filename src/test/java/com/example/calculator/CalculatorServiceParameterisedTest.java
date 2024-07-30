package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;

import com.example.calculator.service.CalculatorService;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceParameterisedTest {

    private CalculatorService calculatorService;
    
    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

   @ParameterizedTest
   @CsvSource({
           "5, 5, 10",
           "10, 5, 15",
           "5, 10, 15"
   })   
    public void testAdd(int a, int b, int expected) {
         assertEquals(expected, calculatorService.add(a, b));
    }
 //Add parameterized test for all the methods
    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "5, 10, -5"
    })
    public void testSubtract(int a, int b, int expected) {
        assertEquals(expected, calculatorService.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 25",
            "10, 5, 50"
    })
    public void testMultiply(int a, int b, int expected) {
        assertEquals(expected, calculatorService.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, 2",
            "5, 10, 0"
    })
    public void testDivide(int a, int b, int expected) {
        assertEquals(expected, calculatorService.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 25",
            "10, 100"
    })
    public void testSquare(int a, int expected) {
        assertEquals(expected, calculatorService.square(a));
    }

   @ParameterizedTest
    @CsvSource({
            "10, '0,1,1,2,3,5,8,13,21,34'",
            "5, '0,1,1,2,3'"
    })
    public void testGenerateFibonacciSeries(int n, String expected) {
        int[] expectedArray = parseArray(expected);
        int[] actual = calculatorService.generateFibonacciSeries(n);
        assertArrayEquals(expectedArray, actual);
    }

    private int[] parseArray(String arrayString) {
        return Arrays.stream(arrayString.split(","))
                     .mapToInt(Integer::parseInt)
                     .toArray();
    }

    
 
}

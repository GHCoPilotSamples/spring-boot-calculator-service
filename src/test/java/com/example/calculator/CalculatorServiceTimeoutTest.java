package com.example.calculator;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.calculator.service.CalculatorService;

public class CalculatorServiceTimeoutTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testTimeoutHandling() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            // Replace this with the actual method call you want to test for timeout
            calculatorService.add(2, 4);
        });
    }
    //Add timeout test for all the methods in CalculatorService
	@Test
    public void testTimeoutHandlingMultiply() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            calculatorService.multiply(2, 4);
        });
    }

    @Test
    public void testTimeoutHandlingDivide() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            calculatorService.divide(2, 4);
        });
    }

    @Test
    public void testTimeoutHandlingSquare() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            calculatorService.square(2);
        });
    }

    @Test
    public void testTimeoutHandlingFibonacci() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            calculatorService.generateFibonacciSeries(2);
        });
    }

    @Test
    public void testTimeoutHandlingAdd() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            calculatorService.add(2, 4);
        });
    }

}
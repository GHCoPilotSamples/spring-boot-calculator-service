package com.example.calculator;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.example.calculator.service.CalculatorService;
@SpringJUnitConfig
@PropertySource("classpath:environment.properties")
public class CalculatorServiceAssumptionTest {
   
    private CalculatorService calculatorService;

    @Value("${os.name}")
    private String osName;

    @Value("${environment}")
    private String environment;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAddWithAssumption() {
        assumeTrue(osName.contains("Windows"));
        assertEquals(10, calculatorService.add(5, 5));
    }

    @Test
    public void testSubtractWithAssumption() {
        assumeTrue(osName.contains("Linux"));
        assertEquals(5, calculatorService.subtract(10, 5));
    }

    @Test
    public void testDivideWithAssumption() {
        assumeTrue("dev".equals(environment));
        assertEquals(2, calculatorService.divide(10, 5));
    }
}
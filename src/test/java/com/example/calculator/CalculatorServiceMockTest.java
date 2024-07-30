package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.ConfigurationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class CalculatorServiceMockTest {

    @Mock
    private ConfigurationService configurationService;

    @InjectMocks
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddWithMockedThreshold() {
        // Mock the getThreshold method
        when(configurationService.getThreshold()).thenReturn(15);

        // Test the add method
        assertEquals(10, calculatorService.add(5, 5));
    }

    // Other tests...
}
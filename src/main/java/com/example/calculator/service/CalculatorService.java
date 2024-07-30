package com.example.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private final ConfigurationService configurationService;
    
    @Autowired
    public CalculatorService(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    public CalculatorService() {
        this.configurationService = new ConfigurationService();

     }
    public int add(int a, int b) {
        try {
                int threshold = configurationService.getThreshold();
                if (a + b > threshold) {
                    throw new IllegalArgumentException("Sum exceeds threshold");
                }
            // Intentionally added a delay to simulate a long-running operation
            Thread.sleep(2000);
            return a + b;
        } catch (Exception e) {
            throw new RuntimeException("Error while adding numbers", e);
        }
    }

    public int subtract(int a, int b) {
        try {
            return a - b;
        } catch (Exception e) {
            throw new RuntimeException("Error while subtracting numbers", e);
        }
    }

    public int multiply(int a, int b) {
        try {
            return a * b;
        } catch (Exception e) {
            throw new RuntimeException("Error while multiplying numbers", e);
        }
    }

    public double divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return (double) a / b;
        } catch (ArithmeticException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("Error while dividing numbers", e);
        }
    }

    public int square(int a) {
        try {
            return a * a;
        } catch (Exception e) {
            throw new RuntimeException("Error while squaring number", e);
        }
    }

    public int[] generateFibonacciSeries(int n) {
        try {
            if (n <= 0) {
                throw new IllegalArgumentException("The length of the Fibonacci series must be positive");
            }
            int[] series = new int[n];
            series[0] = 0;
            if (n > 1) {
                series[1] = 1;
                for (int i = 2; i < n; i++) {
                    series[i] = series[i - 1] + series[i - 2];
                }
            }
            return series;
        } 
        catch (Exception e) {
            throw new RuntimeException("Error while generating Fibonacci series", e);
        }
    }
}
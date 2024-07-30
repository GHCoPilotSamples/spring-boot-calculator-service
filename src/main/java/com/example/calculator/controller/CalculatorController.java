package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add/{num1}/{num2}")
    public double add(@PathVariable int num1, @PathVariable int num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public double subtract(@PathVariable int num1, @PathVariable int num2) {
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public double multiply(@PathVariable int num1, @PathVariable int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide/{num1}/{num2}")
    public double divide(@PathVariable int num1, @PathVariable int num2) {
        return calculatorService.divide(num1, num2);
    }

    @GetMapping("/square/{num}")
    public double square(@PathVariable int num) {
        return calculatorService.square(num);
    }

    @GetMapping("/fibonacci/{n}")
    public int[] fibonacci(@PathVariable int n) {
        return calculatorService.generateFibonacciSeries(n);
    }
}
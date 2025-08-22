package net.anshin.pet.backend.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void add() {
        assertEquals(5, calculatorService.add(2, 3));
    }
}
package edu.iu.p466.arithmetic_service.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticServiceTest {

    ArithmeticService arithmeticService= new ArithmeticService();


    @Test
    void add1and2() {
        int result = (arithmeticService.add(1, 2));
        assertEquals(3, result);
    }

    @Test
    void addNegativeNumbers() {
        int result = (arithmeticService.add(-5, -7));
        assertEquals(-12, result);
    }

    @Test
    void addZero() {
        int result = (arithmeticService.add(0, 0));
        assertEquals(0, result);
    }

    @Test
    void addPositiveAndNegative() {
        int result = (arithmeticService.add(10, -3));
        assertEquals(7, result);
    }
}


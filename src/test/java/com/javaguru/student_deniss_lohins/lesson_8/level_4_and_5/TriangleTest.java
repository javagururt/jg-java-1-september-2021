package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void calculateArea() {
        Triangle victim = new Triangle("Victim", 3, 4, 5);
        double expectedResult = 6;
        assertEquals(expectedResult, victim.calculateArea(), 0.0001);
    }

    @Test
    public void calculatePerimeter() {
        Triangle victim = new Triangle("Victim", 3, 4, 5);
        assertEquals(12, victim.calculatePerimeter(), 0.0001);
    }
}
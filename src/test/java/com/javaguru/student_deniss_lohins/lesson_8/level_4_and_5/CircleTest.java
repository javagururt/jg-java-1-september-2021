package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateArea() {
        Circle circle = new Circle("Circle1", 5);
        double expectedResult = 78.53982;
        assertEquals(expectedResult, circle.calculateArea(), 0.001);
    }

    @Test
    public void calculatePerimeter() {
        Circle circle = new Circle("Circle2", 5);
        double expectedResult = 31.41593;
        assertEquals(expectedResult, circle.calculatePerimeter(), 0.001);
    }
}
package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateArea() {
        Square victim = new Square("square 1", 10);
        assertEquals(100, victim.calculateArea(), 0.01);
    }

    @Test
    public void calculatePerimeter() {
        Square victim = new Square("Square 2", 25);
        assertEquals(100, victim.calculatePerimeter(), 0.01);
    }
}
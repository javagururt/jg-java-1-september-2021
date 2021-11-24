package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class TriangleTest {
    @Test
    public void areaTest(){
        Triangle victim = new Triangle("r", 2, 2, 2);
        double expected = (2 * 2 * Math.pow(3, 0.5)) / 4;
        assertEquals(expected, victim.calculateArea(), 0.01);
    }

    @Test
    public void perimeterTest(){
        Triangle victim = new Triangle("r", 2, 2, 2);
        assertEquals(6, victim.calculatePerimeter(), 0.01);
    }
}
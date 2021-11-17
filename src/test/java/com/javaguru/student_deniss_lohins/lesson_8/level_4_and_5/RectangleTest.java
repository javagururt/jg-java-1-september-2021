package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class RectangleTest {

    @Test
    public void calculateArea() {
        Rectangle victim = new Rectangle("RectangleVictim", 10, 30);
        assertEquals(300, victim.calculateArea(), 0.001);
    }

    @Test
    public void calculatePerimeter() {
        Rectangle victim = new Rectangle("RectangleVictim", 10, 30);
        assertEquals(80, victim.calculatePerimeter(), 0.001);
    }
}
package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class RectangleTest {
    @Test
    public void areaTest(){
        Rectangle victim = new Rectangle("r", 2, 3);
        assertEquals(6, victim.calculateArea(), 0.01);
    }

    @Test
    public void perimeterTest(){
        Rectangle victim = new Rectangle("r", 2, 3);
        assertEquals(10, victim.calculatePerimeter(), 0.01);
    }

}
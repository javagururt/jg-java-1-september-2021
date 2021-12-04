package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class CircleTest {
    @Test
    public void areaTest(){
        double expected = 50.24;
        Circle victim = new Circle("c", 4);
        assertEquals(expected, victim.calculateArea(), 0.1);
    }

    @Test
    public void perimeterTest(){
        double expected = 12.56;
        Circle victim = new Circle("c", 2);
        assertEquals(expected, victim.calculatePerimeter(), 0.1);
    }

}
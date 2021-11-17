package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class SquareTest {
    @Test
    public void calculateAreaTest() {
        Square square = new Square("Square", 10);
        double result = square.calculateArea();
        double expectedResult = 100.0;

        assertEquals(result, expectedResult, 0.0001);

    }

    @Test
    public void calculatePerimeter() {

        Square square = new Square("Square", 10);
        double result = square.calculatePerimeter();
        double expectedResult = 40.0;

        assertEquals(result, expectedResult, 0.00001);

    }
}
package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class TriangleTest {


    @Test
    public void calculateAreaTest() {
        Triangle triangle = new Triangle("triangle", 10);
        double result = triangle.calculateArea();
        double expectedResult = 50.0;

        assertEquals(result, expectedResult, 0.00001);
    }

    @Test
    public void calculatePerimeterTest() {
        Triangle triangle = new Triangle("triangle", 10);
        double result = triangle.calculatePerimeter();
        double expectedResult = 30.0;

        assertEquals(result, expectedResult, 0.00001);
    }
}
package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class RectangleTest {
    @Test
    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 5);
        double result = rectangle.calculateArea();
        double expectedResult = 50.0;

        assertEquals(result, expectedResult, 0.001);

    }

    @Test
    public void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 5);
        double result = rectangle.calculatePerimeter();
        double expectedResult = 30.0;

        assertEquals(result, expectedResult, 0.0001);
    }
}
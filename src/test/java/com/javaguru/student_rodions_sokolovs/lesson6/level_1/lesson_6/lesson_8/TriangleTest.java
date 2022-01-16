package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_8;

import com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void CalculateTriangleArea() {
        Triangle triangle = new Triangle("Triangle", 4);
        double result = triangle.calculateArea();
        double expresult = 8.00;
        assertEquals(result, expresult, 0.0001);
    }

    @Test
    public void CalculateTrianglePerimetre() {
        Triangle triangle = new Triangle("Triangle", 4);
        double result = triangle.calculatePerimeter();
        double expresult = 12.00;
        assertEquals(result, expresult, 0.0001);
    }
}

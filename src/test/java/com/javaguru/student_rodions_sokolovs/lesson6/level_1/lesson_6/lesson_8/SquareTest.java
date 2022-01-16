package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_8;

import com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void CalculateSquareArea() {
        Square square = new Square("Square", 4);
        double result = square.calculateArea();
        double expresult = 16.00;
        assertEquals(result, expresult, 0.0001);
    }

    @Test
    public void CalculateSquarePerimetr() {
        Square square = new Square("Square", 4);
        double result = square.calculatePerimeter();
        double expresult = 16.00;
        assertEquals(result, expresult, 0.0001);
    }
}

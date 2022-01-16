package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_8;

import com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void CalculateArea() {
        Circle circle = new Circle("Circle", 60);
        double result = circle.calculateArea();
        double expresult = 11309.733552923255;
        assertEquals(result, expresult, 0.0001);


    }

    @Test
    public void CalculatePerimetr() {
        Circle circle = new Circle("Circle", 60);
        double result = circle.calculatePerimeter();
        double expresult = 376.99111843077515;
        assertEquals(result, expresult, 0.0001);
    }
}

package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateAreaTest() {
        Circle circle = new Circle("Cirle", 60);

        double result = circle.calculateArea();
        double expectedResult = 11309.733552923255;

        assertEquals(result, expectedResult, 0.0001);//запросы дельты есть обязательный при дабл

    }

    @Test
    public void calculatePerimeterTest() {
        Circle circle = new Circle("Cirle", 60);

        double result = circle.calculatePerimeter();
        double expectedResult = 376.99111843077515;

        assertEquals(result, expectedResult, 0.0001);
    }
}
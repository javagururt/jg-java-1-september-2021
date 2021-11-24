package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class ShapeUtilTest {
    Shape[] shapes;
    @Before
    public void setUp(){
        shapes = new Shape[4];
        shapes[0] = new Circle("c", 3);
        shapes[1] = new Square("s", 3);
        shapes[2] = new Rectangle("r", 3, 3);
        shapes[3] = new Triangle("t", 3, 3, 3);
    }

    @Test
    public void calculateAreaTest(){
        double expected = 0;
        for (int i = 0; i < shapes.length; i++){
            expected += shapes[i].calculateArea();
        }

        assertEquals(expected, ShapeUtil.calculateArea(shapes), 0.001);
    }

    @Test
    public void calculatePerimeterTest(){
        double expected = 0;
        for (int i = 0; i < shapes.length; i++){
            expected += shapes[i].calculatePerimeter();
        }

        assertEquals(expected, ShapeUtil.calculatePerimeter(shapes), 0.001);
    }

}
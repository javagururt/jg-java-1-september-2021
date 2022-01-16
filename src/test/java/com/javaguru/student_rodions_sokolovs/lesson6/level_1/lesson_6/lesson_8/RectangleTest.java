package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_8;

import com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void CalculateRectangleArea(){
        Rectangle rectangle = new Rectangle("Rectangle",3,4);
        double result = rectangle.calculateArea();
        double expresult = 12.00;
        assertEquals(result,expresult,0.0001);
    }
    @Test
    public void CalculateRectanglePerimetr(){
        Rectangle rectangle = new Rectangle("Rectangle",3,4);
        double result = rectangle.calculatePerimeter();
        double expresult = 14.00;
        assertEquals(result,expresult,0.0001);
    }
}

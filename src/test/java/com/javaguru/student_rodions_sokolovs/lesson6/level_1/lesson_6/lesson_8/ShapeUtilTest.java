package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_8;
import com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5.*;
import org.junit.Test;


public class ShapeUtilTest {

    @Test
    public void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        shapeUtil.calculatePerimeter(shape);

    }

    @Test
    public void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        shapeUtil.calculateArea(shape);


    }
}
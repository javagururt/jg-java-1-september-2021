package com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtilDemo shapeUtilDemo = new ShapeUtilDemo();
        shapeUtilDemo.circle();
        shapeUtilDemo.square();
        shapeUtilDemo.triangle();
        shapeUtilDemo.rectangel();
    }
    void circle(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println(circleArea);
        System.out.print(circlePerimeter);
    }
    void square(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimetre = shapeUtil.calculatePerimeter(square);

        System.out.println(squareArea);
        System.out.println(squarePerimetre);

    }
    void triangle(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimetre = shapeUtil.calculatePerimeter(triangle);

        System.out.println(triangleArea);
        System.out.println(trianglePerimetre);
    }
    void rectangel(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangel = shapeUtil.createRandomRectangle();
        double rectangelArea = shapeUtil.calculateArea(rectangel);
        double rectangelPerimetre = shapeUtil.calculatePerimeter(rectangel);

        System.out.print(rectangelArea);
        System.out.print(rectangelPerimetre);
    }
}

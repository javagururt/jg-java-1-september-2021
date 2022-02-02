package com.javaguru.student_jekaterina_ola.lesson_8.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilDemo {
    public static void main (String[] args) {
        ShapeUtilDemo shapeUtilDemo = new ShapeUtilDemo();
        shapeUtilDemo.circle();
        shapeUtilDemo.rectangle();
        shapeUtilDemo.square();
        shapeUtilDemo.triangle();
    }

    public void triangle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle = shapeUtil.createRandomCircle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

        System.out.println(triangleArea);
        System.out.println(trianglePerimeter);
    }

    public void square() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomCircle();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println(squareArea);
        System.out.println(squarePerimeter);
    }


    public void circle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println(circleArea);
        System.out.println(circlePerimeter);

    }

    public void rectangle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomCircle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

        System.out.println(rectangleArea);
        System.out.println(rectanglePerimeter);
    }
}

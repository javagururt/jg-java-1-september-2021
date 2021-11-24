package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {
    public static void main(String[] args) {
        Shape circle = ShapeUtil.createRandomCircle();
        double circleArea = ShapeUtil.calculateArea(circle);
        double circlePerimeter = ShapeUtil.calculatePerimeter(circle);
        System.out.println(circleArea + "  " + circlePerimeter);

        System.out.println("-----");

        Shape square = ShapeUtil.createRandomSquare();
        double squareArea = ShapeUtil.calculateArea(square);
        double squarePerimeter = ShapeUtil.calculatePerimeter(square);
        System.out.println(squareArea + "  " + squarePerimeter);
    }
}

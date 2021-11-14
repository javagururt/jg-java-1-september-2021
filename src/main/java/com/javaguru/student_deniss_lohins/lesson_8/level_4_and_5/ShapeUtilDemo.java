package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtilDemo runner = new ShapeUtilDemo();
        runner.circleCalculation();
        runner.squareCalculator();
        runner.rectangleCalculator();
        runner.triangleCalculator();
    }
    void circleCalculation(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("circle area = " + circleArea);
        System.out.println("circle perimeter = " + circlePerimeter);
    }
    void squareCalculator(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("square area = " + squareArea);
        System.out.println("square perimeter = " + squarePerimeter);
    }
    void rectangleCalculator(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("rectangle area = " + rectangleArea);
        System.out.println("rectangle perimeter = " + rectanglePerimeter);
    }

    void triangleCalculator(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("triangle area = " + triangleArea);
        System.out.println("triangle perimeter = " + trianglePerimeter);
    }
}

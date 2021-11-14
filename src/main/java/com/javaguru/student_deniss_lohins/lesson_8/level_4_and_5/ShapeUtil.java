package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

import java.util.Random;

class ShapeUtil {
    int circleCounter = 1;
    int squareCounter = 1;
    int rectangleCounter = 1;
    int triangleCounter = 1;

    Circle createRandomCircle() {
        Random rm = new Random();
        double radius = rm.nextDouble();
        String circleName = "RandomCircle" + circleCounter;
        Circle randomcircle = new Circle(circleName, radius);
        circleCounter++;
        return randomcircle;
    }

    Square createRandomSquare() {
        Random rm = new Random();
        double side = rm.nextDouble();
        String squareName = "RandomSquare" + squareCounter;
        Square randomSquare = new Square(squareName, side);
        squareCounter++;
        return randomSquare;
    }

    Rectangle createRandomRectangle() {
        Random rm = new Random();
        double sideA = rm.nextDouble();
        double sideB = rm.nextDouble();
        String rectangleName = "RandomRectangle" + rectangleCounter;
        Rectangle randomRectangle = new Rectangle(rectangleName, sideA, sideB);
        rectangleCounter++;
        return randomRectangle;
    }

    Triangle createRandomTriangle() {
        Random rm = new Random();
        double side = rm.nextDouble();
        String triangleName = "RandomTriangle" + triangleCounter;
        Triangle randomTriangle = new Triangle(triangleName, side, side, side);
        triangleCounter++;
        return randomTriangle;
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (int i = 0; i < shapes.length; i++) {
            area = area + shapes[i].calculateArea();
        }
        return area;
    }
    double calculatePerimeter(Shape[] shapes){
        double perimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            perimeter = perimeter + shapes[i].calculatePerimeter();
        }
        return perimeter;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}

package com.javaguru.student_jekaterina_ola.lesson_8.level_4_junior;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {
        double random = Math.random() * 100;
        Circle circle = new Circle("Circle", random);
        return circle;
    }

    Square createRandomSquare() {
        double random = Math.random() * 100;
        Square square = new Square("Square", random);
        return square;
    }

    Rectangle createRandomRectangle() {
        double random = Math.random() * 100;
        double random1 = Math.random() * 100;
        Rectangle rectangle = new Rectangle("Rectangle", random, random1);
        return rectangle;
    }


    Triangle createRandomTriangle() {
        double random = Math.random() * 100;
        double random1 = Math.random() * 100;
        double random2 = Math.random() * 100;
        Triangle triangle = new Triangle("Triangle", random, random1, random2);
        return triangle;
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

    double calculateArea(Shape shapes) {
        return shapes.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

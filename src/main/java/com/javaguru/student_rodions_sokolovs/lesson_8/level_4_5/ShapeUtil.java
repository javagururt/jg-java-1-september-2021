package com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class ShapeUtil {
    public Circle createRandomCircle() {
        double random = Math.random() * 100;
        Circle circle = new Circle("Circle", random);
        return circle;
    }

    public Square createRandomSquare() {
        double random = Math.random() * 100;
        Square square = new Square("Square", random);
        return square;
    }

    public Rectangle createRandomRectangle() {
        double random = Math.random() * 100;
        double secondrandom = Math.random() * 100;
        Rectangle rectangle = new Rectangle("Rectangle", random, secondrandom);
        return rectangle;
    }

    public Triangle createRandomTriangle() {
        double random = Math.random() * 100;
        Triangle triangle = new Triangle("Triangle", random);
        return triangle;
    }

    public Shape createRandomShape() {
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

    public double calculateArea(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result = result + shapes[i].calculateArea();

        }
        return result;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result = result + shapes[i].calculatePerimeter();

        }
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

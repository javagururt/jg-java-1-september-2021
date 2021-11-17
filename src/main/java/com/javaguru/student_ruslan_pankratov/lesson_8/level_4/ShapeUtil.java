package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;

//Task_20-
@CodeReview(approved = true)
class ShapeUtil {

    Circle createRandomCircle() {
        double random = Math.random() * 100;
        Circle circle = new Circle("Cirl", random);
        return circle;
    }
    Square createRandomSquare(){
        double random = Math.random() * 100;
        Square square = new Square("Square", random);
        return square;
    }
    Rectangle createRandomRectangle(){
        double random = Math.random() * 100;
        double randomTwo = Math.random() * 100;
        Rectangle rectangle = new Rectangle("Rectangle", random, randomTwo);
        return rectangle;
    }

    Triangle createRandomTriangle(){
        double random = Math.random() * 100;
        Triangle triangle = new Triangle("Triangle", random);
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


    double calculateArea(Shape[] shapes){//Под вопросом
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result = result + shapes[i].calculateArea();
        }
        return result;
    }

    double calculatePerimeter(Shape[] shapes){
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

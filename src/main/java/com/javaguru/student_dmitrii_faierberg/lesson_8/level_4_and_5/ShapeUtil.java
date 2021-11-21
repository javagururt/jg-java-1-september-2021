package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

import java.util.Random;

class ShapeUtil {
    static Circle createRandomCircle(){
        Random random = new Random();
        int radius = random.nextInt(19) + 1;
        return new Circle("c", radius);
    }

    static Square createRandomSquare(){
        Random random = new Random();
        int side = random.nextInt(19) + 1;
        return new Square("s", side);
    }

    static Rectangle createRandomRectangle(){
        Random random = new Random();
        int sideA = random.nextInt(19) + 1;
        int sideB = random.nextInt(19) + 1;
        return new Rectangle("r", sideA, sideB);
    }

    static Triangle createRandomTriangle(){
        Random random = new Random();
        int side = random.nextInt(19) + 1;
        return new Triangle("t", side, side, side);
    }

    static Shape createRandomShape() {
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

    static double calculateArea(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++){
            sum += shapes[i].calculateArea();
        }
        return sum;
    }

    static double calculatePerimeter(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++){
            sum += shapes[i].calculatePerimeter();
        }
        return sum;
    }

    static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    static double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

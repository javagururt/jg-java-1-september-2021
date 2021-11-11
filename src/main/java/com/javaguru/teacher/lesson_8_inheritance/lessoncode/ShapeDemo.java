package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class ShapeDemo {

    public static void main(String[] args) {
        Square square = new Square("Black", 10);
        double squareArea = square.calculateArea();
        System.out.println("Square area: " + squareArea);

        Rectangle rectangle = new Rectangle("Red", 10, 20);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle area: " + rectangleArea);

        Circle circle = new Circle("Yellow", 100);
        double circleArea = circle.calculateArea();
        System.out.println("Circle area: " + circleArea);
    }
}

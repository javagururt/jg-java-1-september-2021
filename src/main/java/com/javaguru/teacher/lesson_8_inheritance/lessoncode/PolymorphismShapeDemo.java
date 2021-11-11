package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class PolymorphismShapeDemo {

    public static void main(String[] args) {
        Square[] squares = {
                new Square("Black", 10),
                new Square("Red", 5),
                new Square("Yellow", 30),
        };

        ShapeService shapeService = new ShapeService();
        double squareAreaSumResult = shapeService.sumArea(squares);
        System.out.println("Square area sum result: " + squareAreaSumResult);

        Shape[] shapes = {
                new Square("Black", 20),
                new Rectangle("Yellow", 30, 40),
                new Circle("Red", 100),
                new Square("Blue", 50),
        };

        double shapeAreaSumResult = shapeService.sumArea(shapes);
        System.out.println("Result = " + shapeAreaSumResult);

    }
}

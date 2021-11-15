package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

//Task_16
class Circle extends Shape {
    public static void main(String[] args) {
        Circle circle = new Circle("Cirle", 60);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double result = (Math.PI) * (radius * radius);
        return result;

    }

    @Override
    double calculatePerimeter() {
        double result = (Math.PI) * (radius + radius);
        return result;
    }


}

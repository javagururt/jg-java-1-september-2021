package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

class Square extends Shape{
    double side;
    Square(String title, double side){
        super(title);
        this.side = side;
    }
    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

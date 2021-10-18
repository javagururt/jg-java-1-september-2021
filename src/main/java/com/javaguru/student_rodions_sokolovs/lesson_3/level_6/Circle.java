
package com.javaguru.student_rodions_sokolovs.lesson_3.level_6;

class Circle {
    double radius;

    double calculateArea(double radius) {
        double Pi = 3.14;
        double result = Pi * (radius * radius);
        return result;
    }
}


//    Разработать класс - круг, у которого должны быть следующие характеристики:
//        Свойства: радиус (double radius),
//        Методы: расчет площади (double calculateArea()).
//
//        Класс с объявлением фигуры круг должен называться "Circle".
//        Класс с демонстрацией работы должен называться "CircleDemo".
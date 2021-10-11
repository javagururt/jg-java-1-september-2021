package com.javaguru.student_jekaterina_ola.lesson_2.level_3.task_10;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
//        радиус круга (вещественное число) и печатает на консоль
//        периметр и площадь круга.
//
//        Test Data:
//        Radius = 7.5
//
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

public class CircleRadius {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Perimetr is =" + (2 * radius * Math.PI));
        System.out.println("Area is =" + (Math.PI * radius * radius));
    }
}

package com.javaguru.student_Vladislav_Pipirin.lesson_2.homework.level_3;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586
public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Radius: ");
        double firstDoubleNumber = input.nextDouble();
        double perimeterResult = 2 * Math.PI * firstDoubleNumber;
        System.out.println(" Perimeter is: " + perimeterResult);
        double areaResult = Math.PI * firstDoubleNumber * firstDoubleNumber;
        System.out.println(" Area is: " + areaResult);
    }
}




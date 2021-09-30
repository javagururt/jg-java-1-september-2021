package com.javaguru.student_georgijs_kuznecovs.lesson_2;

import java.util.Scanner;

public class L2Task10 {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга: ");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        double Pi = 3.1415926536;
        double perimeter = 2 * Pi * num;
        double area = Pi * num * num;

        System.out.println("Длина окружности = " + perimeter);
        System.out.println("Площадь круга = " + area);
    }
}
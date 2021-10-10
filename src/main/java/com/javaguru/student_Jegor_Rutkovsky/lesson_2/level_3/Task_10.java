package com.javaguru.student_Jegor_Rutkovsky.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double pi = 3.14159265359;
        double l = 2 * r * pi;
        System.out.println("Периметр круга = " + l);

        double s = r * r * pi;
        System.out.println("Площадь круга = " + s);
    }
}
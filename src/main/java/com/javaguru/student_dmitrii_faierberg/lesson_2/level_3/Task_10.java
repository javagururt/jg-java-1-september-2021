package com.javaguru.student_dmitrii_faierberg.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double pi = 3.1415;

        System.out.println("Perimeter is: " + (2 * pi * radius));
        System.out.println("Area is: " + (pi * radius * radius));

    }
}

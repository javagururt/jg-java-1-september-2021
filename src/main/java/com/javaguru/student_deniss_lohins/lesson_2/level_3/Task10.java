package com.javaguru.student_deniss_lohins.lesson_2.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Please enter radius: ");
        double radius = input.nextDouble();
        double pi = Math.PI;
        double perimetr = (2 * radius * pi);
        double area = (pi * radius * radius);
        System.out.println("Perimeter is " + perimetr);
        System.out.println("Area is " + area);
    }
}

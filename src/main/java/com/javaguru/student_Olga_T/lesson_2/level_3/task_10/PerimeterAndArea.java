package com.javaguru.student_Olga_T.lesson_2.level_3.task_10;

import java.util.Scanner;

public class PerimeterAndArea {
    public static void main(String[] args) {
        System.out.println("Please enter the radius of a circle:  ");
        Scanner number = new Scanner(System.in);
        double inputNumber = number.nextDouble();
        double pi = 3.1415926535897932384626433832795;


        System.out.println("Entered radius = " + inputNumber);
        System.out.println("Perimeter is = " + 2 * pi * inputNumber);
        System.out.println("Area is = " + pi * inputNumber * inputNumber );

    }
}

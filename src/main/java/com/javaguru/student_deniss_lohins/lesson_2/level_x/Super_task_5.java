package com.javaguru.student_deniss_lohins.lesson_2.level_x;

import java.util.Scanner;

public class Super_task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Please enter radius: ");  //operator input radius oc circle
        double radius = input.nextDouble();
        System.out.print("Please enter units: "); //operator must enter units
        String units = input.next();
        double pi = Math.PI;
        /*
        as next, all calculations must be performed
         */
        double perimetr = (2 * radius * pi);
        double area = (pi * radius * radius);
        //results must be shown to operator
        System.out.println("Perimeter is " + perimetr + " " + units);
        System.out.println("Area is " + area + " square " + units);
        }
}

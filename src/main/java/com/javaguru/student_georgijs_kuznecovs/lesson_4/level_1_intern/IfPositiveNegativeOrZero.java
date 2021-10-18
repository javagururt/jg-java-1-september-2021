package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_1_intern;

import java.util.Scanner;

class IfPositiveNegativeOrZero {
    public static void main(String[] args){

        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i > 0) {
            System.out.print("The number is posivite");
        } else if (i < 0) {
            System.out.print("The number is negative");
        } else {
            System.out.print("Your number is 0 - it's neither positive nor negative ");
        }
    }
}
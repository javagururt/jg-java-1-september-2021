package com.javaguru.student_deniss_lohins.lesson_1;

import java.util.Scanner;

public class task11b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number:  ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number:  ");
        int b = input.nextInt();
        System.out.println("result is: " + (a / b));
    }
}

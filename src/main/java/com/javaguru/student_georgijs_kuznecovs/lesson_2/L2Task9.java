package com.javaguru.student_georgijs_kuznecovs.lesson_2;

import java.util.Scanner;

public class L2Task9 {
    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int count = 1;
        System.out.println("Multiplication table: ");
        while (count < 11) {
            System.out.println(num + " x " + count + " = " + num * count);
            count++;

        }

    }
}

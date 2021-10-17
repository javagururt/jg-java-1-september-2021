package com.javaguru.student_mihails_mihejevs.lesson_4.level_1;

import java.util.Scanner;

public class HwTask1 {
    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter whole number: ");
        Scanner input = new Scanner(System.in);
        int enteredNumber = input.nextInt();

        if (enteredNumber > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
                    }
    }
}

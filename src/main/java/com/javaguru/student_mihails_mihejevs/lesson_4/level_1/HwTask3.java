package com.javaguru.student_mihails_mihejevs.lesson_4.level_1;

import java.util.Scanner;

public class HwTask3 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter whole number from 1 to 7 : ");
        Scanner input = new Scanner(System.in);
        int enteredNumber = input.nextInt();

        if (enteredNumber == 1) {
            System.out.println("monday");
        } else if (enteredNumber == 2) {
            System.out.println("tuesday");
        } else if (enteredNumber == 3) {
            System.out.println("wednesday");
        } else if (enteredNumber == 4) {
            System.out.println("thusday");
        } else if (enteredNumber == 5) {
            System.out.println("friday");
        } else if (enteredNumber == 6) {
            System.out.println("saturday");
        } else {
            System.out.println("sunday");
        }
    }
}



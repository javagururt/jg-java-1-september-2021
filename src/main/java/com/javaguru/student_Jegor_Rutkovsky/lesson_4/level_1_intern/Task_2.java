package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        System.out.println("Enter yor number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Your number " +number+ " is positive");
        }
        else if (number < 0){
            System.out.println("Your number " +number+ " is negative");
        }
        else {
            System.out.println("Your number is equals zero");
        }

        }
}

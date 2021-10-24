package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import java.util.Scanner;

class ThreeNumbers {
    /*
    Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
     */
    public static void main(String[] args) {
        System.out.println("Please enter first number : ");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();

        System.out.println("Please enter second number : ");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();

        System.out.println("Please enter third number : ");
        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println("Numbers are equals.");
        } else if (number1 != number2 && number2 == number3) {
            System.out.println("Numbers are different.");
        } else if (number1 != number3) {
            System.out.println("Numbers are different.");
        } else {System.out.println("Neither all are equal or different.");
        }
    }
}

package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import java.util.Scanner;

class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("Please enter first number : ");
        Scanner input1 = new Scanner(System.in);
        int smallestNumber1 = input1.nextInt();

        System.out.println("Please enter second number : ");
        Scanner input2 = new Scanner(System.in);
        int smallestNumber2 = input2.nextInt();

        if (smallestNumber1 < smallestNumber2) {
            System.out.println("The smallest number is : " + smallestNumber1);
        } else {
            System.out.println("The smallest number is : " + smallestNumber2);
        }
    }
}

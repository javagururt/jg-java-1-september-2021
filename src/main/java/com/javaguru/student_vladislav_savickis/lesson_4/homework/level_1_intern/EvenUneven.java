package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_1_intern;

import java.util.Scanner;

public class EvenUneven {
    public static void main(String[] args) {
        System.out.println("Hi! Please enter int number.");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        if(inputNumber % 2 == 0) {
            System.out.println("Number is even.");
        }
        else if (inputNumber % 2 == 1) {
            System.out.println("Number is uneven.");
        }
    }
}

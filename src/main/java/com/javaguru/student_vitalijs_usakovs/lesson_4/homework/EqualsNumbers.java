package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import java.util.Scanner;

class EqualsNumbers {
    /*
    Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
     */
    public static void main(String[] args) {
        System.out.println("Please enter first number : ");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();

        System.out.println("Please enter second number : ");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals.");
        } else {
            System.out.println("Numbers are different.");
        }
    }
}


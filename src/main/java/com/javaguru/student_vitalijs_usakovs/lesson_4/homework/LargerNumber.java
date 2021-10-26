package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */
class LargerNumber {
    public static void main(String[] args) {
        System.out.println("Please enter first number : ");
        Scanner input1 = new Scanner(System.in);
        int largerNumber1 = input1.nextInt();

        System.out.println("Please enter second number : ");
        Scanner input2 = new Scanner(System.in);
        int largerNumber2 = input2.nextInt();

        if (largerNumber1 > largerNumber2) {
            System.out.println("The larger number is : " + largerNumber1);
        } else {
            System.out.println("The larger number is : " + largerNumber2);
        }
    }
}

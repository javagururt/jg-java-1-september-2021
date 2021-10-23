package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import java.util.Scanner;

class LargerNumberCalc {
    /*
    Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.
PS: перед решением этой задачи распишите на бумаге
или в комментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
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

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }

    }
}

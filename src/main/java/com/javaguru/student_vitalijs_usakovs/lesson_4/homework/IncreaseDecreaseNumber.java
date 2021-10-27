package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class IncreaseDecreaseNumber {
    /*
    Напишите программу, которая принимает от пользователя три числа и печатает:
- «возрастающий», если числа расположены в порядке возрастания,
- «убывающий», если числа идут в убывающем порядке,
- «Ни в возрастающем, ни в убывающем порядке» иначе.
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

        if (number1 < number2 && number2 < number3) {
            System.out.print("increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.print("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
package com.javaguru.student_jekaterina_ola.lesson_2.level_3.task_9;


//Напишите программу, которая запрашивает у пользователя целое число
  //      и печатает на консоль таблицу умножения для этого числа до 10.
//
  //      Test Data:
    //    Input a number: 8
//
  //      Expected Output :
    //    8 x 1 = 8
      //  8 x 2 = 16
        //8 x 3 = 24
     //   ...
       // 8 x 10 = 80

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.println(firstNumber + "x 1=" + firstNumber);
        System.out.println(firstNumber + "x 2=" + firstNumber * 2);
        System.out.println(firstNumber + "x 3=" + firstNumber * 3);
        System.out.println(firstNumber + "x 4=" + firstNumber * 4);
        System.out.println(firstNumber + "x 5=" + firstNumber * 5);
        System.out.println(firstNumber + "x 6=" + firstNumber * 6);
        System.out.println(firstNumber + "x 7=" + firstNumber * 7);
        System.out.println(firstNumber + "x 8=" + firstNumber * 8);
        System.out.println(firstNumber + "x 9=" + firstNumber * 9);
        System.out.println(firstNumber + "x 10=" + firstNumber * 10);
    }
}

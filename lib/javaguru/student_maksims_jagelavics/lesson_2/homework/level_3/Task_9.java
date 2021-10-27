package com.javaguru.student_maksims_jagelavics.lesson_2.homework.level_3;

//Напишите программу, которая запрашивает у пользователя целое число
//и печатает на консоль таблицу умножения для этого числа до 10.
//
//Test Data:
//Input a number: 8
//
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = input.nextInt();
        int two = number * 2;
        int three = number * 3;
        int four = number * 4;
        int five = number * 5;
        int six = number * 6;
        int seven = number * 7;
        int eight = number * 8;
        int nine = number * 9;
        int ten = number * 10;
        System.out.println("Results:");
        System.out.println(number + " x 1 = " + number);
        System.out.println(number + " x 2 = " + two);
        System.out.println(number + " x 3 = " + three);
        System.out.println(number + " x 4 = " + four);
        System.out.println(number + " x 5 = " + five);
        System.out.println(number + " x 6 = " + six);
        System.out.println(number + " x 7 = " + seven);
        System.out.println(number + " x 8 = " + eight);
        System.out.println(number + " x 9 = " + nine);
        System.out.println(number + " x 10 = " + ten);
    }

}

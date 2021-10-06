//Напишите программу, которая запрашивает у пользователя целое число
//        и печатает на консоль таблицу умножения для этого числа до 10.
//
//        Test Data:
//        Input a number: 8
//
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80


package com.javaguru.student_rodions_sokolovs.lesson_2.level_3;

import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Level_3_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.printf( n +" x %d = %d   \n", i, n * i);
        }
        }
    }


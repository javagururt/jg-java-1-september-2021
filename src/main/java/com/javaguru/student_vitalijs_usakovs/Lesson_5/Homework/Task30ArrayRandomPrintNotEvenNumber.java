package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
class Task30ArrayRandomPrintNotEvenNumber {
    //Task 30


    public static void main(String[] args) {

        System.out.println("Please enter how many number's you want to enter : ");
        Random randomGenerator = new Random();
        Scanner input = new Scanner(System.in);
        int numberLength = input.nextInt();


        int[] length = new int[numberLength];
        for (int i = 0; i < length.length; i++) {
            length[i] = randomGenerator.nextInt(100);
        }

        System.out.println("Numbers are : ");
        for (int result : length) {
            System.out.println(result);
        }

        int NotEvenNumber = length[0];
        for (int i = 0; i < length.length; i++) {
            if (length[i] % 2 != 0) {
                System.out.println("Not even number is : " + length[i]);
            }
        }
    }
}

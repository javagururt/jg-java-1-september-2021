package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;
@CodeReview(approved = true)
class Task25UserSuggest {
    //Task 25

    public static void main(String[] args) {
        System.out.println("Please enter how many number do you want to enter : ");
        Scanner input = new Scanner(System.in);
        int numberLength = input.nextInt();

        System.out.println("Please enter number's : ");
        int[] length = new int[numberLength];
        for (int i = 0; i < length.length; i++) {
            length[i] = input.nextInt();
        }
        System.out.println("Your have entered : ");
        for (int result : length) {
            System.out.println((result));
        }
    }
}

package com.javaguru.student_rodions_sokolovs.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Please input 3 numbers:");
        Scanner input = new Scanner(System.in);
        int firstnumber = input.nextInt();
        int secondnumber = input.nextInt();
        int thirdnumber = input.nextInt();
        int[] numbers = {firstnumber, secondnumber, thirdnumber};
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
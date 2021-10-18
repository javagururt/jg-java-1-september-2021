package com.javaguru.student_Jegor_Rutkovsky.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_9 {
        public static void main(String[] args) {
            System.out.println("Введите число: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            for (int i=1; i<11; i++)
                System.out.println(number+ " * " +i+ " = " +(number * i));
        }
}

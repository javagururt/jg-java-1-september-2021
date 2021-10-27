package com.javaguru.student_georgijs_kuznecovs.lesson_2.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class L2Task9 {
    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int count = 1;
        System.out.println("Multiplication table: ");
        while (count < 11) {
            System.out.println(num + " x " + count + " = " + num * count);
            count++;

        }

    }
}

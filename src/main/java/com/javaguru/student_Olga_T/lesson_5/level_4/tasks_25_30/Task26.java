package com.javaguru.student_Olga_T.lesson_5.level_4.tasks_25_30;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
class Task26 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scannerUserNumber = new Scanner(System.in);
        System.out.println("Please enter arrays length: ");

        int userArrayNumber = scannerUserNumber.nextInt();
        int[] userArrayLength = new int[userArrayNumber];


        for (int i = 0; i < userArrayLength.length; i++) {
            userArrayLength[i] = random.nextInt(50);
            System.out.println("userArrayNumber [" + i + "] = " + userArrayLength[i]);
        }

    }
}


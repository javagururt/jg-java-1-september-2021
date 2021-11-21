package com.javaguru.student_rodions_sokolovs.lesson_6.Level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_17 {
    public static void main(String[] args) {
        System.out.println("For loop");
        for (int i = 0; i >-1; i++) {
            System.out.println(i);
            break;
        }
        System.out.println();

        System.out.println("While loop");
        int i = 0;
        while (i > -1) {
            System.out.println(i);
            i++;
            break;
        }
    }
}

package com.javaguru.student_georgijs_kuznecovs.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_16 {   //16+17
    public static void main (String[] args){
        int count = 0;
        while (count >= 0){
            System.out.println("I can't stop!!! While...");
            count++;

            if (count == 15) break;
        }
/*
        for (int i = 0; i >= 0; i++){
            System.out.println("I can't stop for...");

            if (i == 15) break;
        }*/
    }
}

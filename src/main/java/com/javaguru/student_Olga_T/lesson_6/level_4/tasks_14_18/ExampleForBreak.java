package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ExampleForBreak {
    public static void main(String[] args) {

        for (int y = 2; y < 200; y++) {
            if (y == 50) {
                break;
            }
            System.out.println("y = " + y);
        }
    }
}
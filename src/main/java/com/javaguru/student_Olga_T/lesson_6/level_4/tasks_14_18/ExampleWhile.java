package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ExampleWhile {
    public static void main(String[] args) {
        int a = 100;
        while (a < 125) {
            System.out.println("a = " + a++);
        }
    }
}

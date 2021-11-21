package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ExampleWhileBreak {
    public static void main(String[] args) {
        int b = 0;
        while (b < 100) {
            b++;
            System.out.println("b = " + b);
            if (b == 22) {
                break;
            }
        }
    }
}

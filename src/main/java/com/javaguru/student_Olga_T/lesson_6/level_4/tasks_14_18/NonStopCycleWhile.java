package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NonStopCycleWhile {

    public static void main(String[] args) {
        int x = 2;
        while (x > 1) {
            System.out.println(x++);
        }
    }
}

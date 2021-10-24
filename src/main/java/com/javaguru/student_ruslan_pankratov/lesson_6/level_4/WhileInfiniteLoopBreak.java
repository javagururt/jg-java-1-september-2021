package com.javaguru.student_ruslan_pankratov.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_16
@CodeReview(approved = true)
class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        while (true) {
            System.out.println(1);
            break;
        }
    }
}

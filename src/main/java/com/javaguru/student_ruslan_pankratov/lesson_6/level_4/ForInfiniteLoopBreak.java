package com.javaguru.student_ruslan_pankratov.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_16
@CodeReview(approved = true)
public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
            break;
        }
    }
}

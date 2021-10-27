package com.javaguru.student_ruslan_pankratov.lesson_6.level_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

//Task_17
@CodeReview(approved = true)
class WhileLoopContinue {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        while (a < b) {

            if (a > 15) {
                continue;
            }
            a++;
            System.out.println(a);

        }
    }
}

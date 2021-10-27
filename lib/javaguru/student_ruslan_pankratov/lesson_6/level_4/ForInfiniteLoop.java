package com.javaguru.student_ruslan_pankratov.lesson_6.level_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

//Task_15
@CodeReview(approved = true)
class ForInfiniteLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }
}

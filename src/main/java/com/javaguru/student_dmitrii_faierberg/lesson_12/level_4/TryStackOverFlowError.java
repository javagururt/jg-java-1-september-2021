package com.javaguru.student_dmitrii_faierberg.lesson_12.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TryStackOverFlowError {
    public static int recursive(int a){
        System.out.print(a + " ");
        return recursive(a);
    }

    public static void main(String[] args) {
        recursive(1);
    }
}

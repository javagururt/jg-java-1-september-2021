package com.javaguru.student_deniss_lohins.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InfiniteLoop {


    void infiniteLoopUsingWhile() {
        while (true) {
            System.out.println("Infinite loop");
        }
    }


    void infiniteLoopUsingFor() {
        for (int i = 0;i > -1; i++) {
            System.out.print(i);
        }
    }
}

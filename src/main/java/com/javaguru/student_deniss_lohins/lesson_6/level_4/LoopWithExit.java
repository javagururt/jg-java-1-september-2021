package com.javaguru.student_deniss_lohins.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LoopWithExit {


    void loopUsingWhile() {
        int i = 0;
        while (i<50) {
            System.out.println("Infinite loop");
            i++;
        }
    }


    void loopUsingFor() {
        for (int i = 0;i < 50; i++) {
            System.out.print(i);
        }
    }
}

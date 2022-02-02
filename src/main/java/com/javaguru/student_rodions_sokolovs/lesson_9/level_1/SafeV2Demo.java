package com.javaguru.student_rodions_sokolovs.lesson_9.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeV2Demo {
    public static void main(String[] args) {
        SafeV2 safeV2 = new SafeV2(0000, 999);
        safeV2.getMoney(1111, 1);
        safeV2.putMoney(0000, 100);
        safeV2.putMoney(0000, 20);
    }
}

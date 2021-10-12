package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BaloonDemo {
    public static void main(String[] args) {
        Baloon baloon = new Baloon(20.2, 10, "Red");
        baloon.properties();
    }
}

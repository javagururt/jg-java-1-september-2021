package com.javaguru.student_deniss_lohins.lesson_9.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("qwerty", 2000);
        System.out.println("Money amount in safe is: " + safe.getAmount());
        System.out.println("Safe password is: " + safe.getPassword());
    }
}

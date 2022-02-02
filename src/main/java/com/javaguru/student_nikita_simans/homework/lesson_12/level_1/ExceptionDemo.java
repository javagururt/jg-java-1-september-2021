package com.javaguru.student_nikita_simans.homework.lesson_12.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ExceptionDemo {
    public static void main(String[] args) {
        Exception exception1 = new Exception();
        Exception exception2 = new Exception("Message");
        Exception exception3 = new Exception("message", exception2.getCause());
        Exception exception4 = new Exception(exception1.getCause());
    }
}


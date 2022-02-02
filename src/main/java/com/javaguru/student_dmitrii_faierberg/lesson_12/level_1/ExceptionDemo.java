package com.javaguru.student_dmitrii_faierberg.lesson_12.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ExceptionDemo {
    public static void main(String[] args) {
        MyException exception = new MyException("Exception");
        System.out.println(exception.getMessage());
    }
}

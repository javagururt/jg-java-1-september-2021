package com.javaguru.student_rodions_sokolovs.lesson_9.level_1.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(2);
        System.out.println(1);
    }
}
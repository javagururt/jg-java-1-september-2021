package com.javaguru.student_jekaterina_ola.lesson_9.level_2_intern.Task_11;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Child extends Parent {
    int c;
    protected Child(int i, int c) {
        super(i);
        this.c = c;
    }
}

package com.javaguru.student_jekaterina_ola.lesson_9.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
       // super();
        System.out.println(2);
    }
}

// используется для вызова суперкласса у субклассов
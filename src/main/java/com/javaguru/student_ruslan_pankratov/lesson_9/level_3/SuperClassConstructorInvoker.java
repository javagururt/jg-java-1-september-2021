package com.javaguru.student_ruslan_pankratov.lesson_9.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}

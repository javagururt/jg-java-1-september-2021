package com.javaguru.student_dmitrii_faierberg.lesson_8.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class LoanSystem {
    abstract boolean canReceiveLoan(Human human);
}
package com.javaguru.student_jekaterina_ola.lesson_8.level_3_junior.Task_10_11;

import com.javaguru.teacher.codereview.CodeReview;

//Исправьте код программы так, что бы он компилировался.
//        Класс LoanSystem должен остаться абстрактным.
@CodeReview(approved = true)
public abstract class LoanSystem {

    abstract boolean canReceiveLoan (Human human);
}

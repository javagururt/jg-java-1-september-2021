package com.javaguru.student_deniss_lohins.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Если переменная не используется, то зачем она?" +
        "Если метод isEven то результат должен быть true/false")
class EvenOrOdd {

    int number;

    int dividing(int number){
        int resultOfCalculation = number % 2;
        return resultOfCalculation;
    }

    boolean isEven(int number){
        if (dividing(number) == 0){
            System.out.println("Number is even");
            return true;
        }else{
            System.out.println("Number is odd");
            return false;
        }
    }
}

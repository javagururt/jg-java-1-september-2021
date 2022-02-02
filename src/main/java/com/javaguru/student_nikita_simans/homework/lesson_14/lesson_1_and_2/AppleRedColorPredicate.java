package com.javaguru.student_nikita_simans.homework.lesson_14.lesson_1_and_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AppleRedColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equalsIgnoreCase("red")){
            return true;
        }
        return false;
    }
}

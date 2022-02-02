package com.javaguru.student_nikita_simans.homework.lesson_14.lesson_1_and_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight() > 150){
            return true;
        }
        return false;
    }
}

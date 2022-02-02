package com.javaguru.student_deniss_lohins.lesson_14.level_1_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class isGreen implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equalsIgnoreCase("green")){
            return true;
        }
        return false;
    }
}

package com.javaguru.student_dmitrii_faierberg.lesson_14.level_1_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return "green".equals(apple.getColor());
    }

}

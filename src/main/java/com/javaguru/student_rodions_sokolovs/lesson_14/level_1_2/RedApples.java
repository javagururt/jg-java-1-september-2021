package com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RedApples implements ApplePredicate{
    public boolean test(Apple apple) {
        if(apple.getColor().equalsIgnoreCase("red")){
            return true;
        }
        return false;
    }
}

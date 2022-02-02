package com.javaguru.student_rodions_sokolovs.lesson_9.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {
    public static void main(String[] args){
        Safe safe = new Safe();
        safe.password = 123;
        safe.money = 3023;

    }
}

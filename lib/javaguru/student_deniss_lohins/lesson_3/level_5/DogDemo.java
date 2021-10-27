package com.javaguru.student_deniss_lohins.lesson_3.level_5;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Gloria", 1, "White");
        dog1.voice();
        dog1.happyBirthday();
        dog1.voice();
        dog1.changeColour("Black");
        dog1.voice();
    }
}

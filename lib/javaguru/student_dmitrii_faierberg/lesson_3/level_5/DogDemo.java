package com.javaguru.student_dmitrii_faierberg.lesson_3.level_5;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Tuzik", 8, "Black");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("White");
        dog.voice();
    }
}

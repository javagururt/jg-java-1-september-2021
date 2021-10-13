package com.javaguru.student_ruslan_pankratov.lesson_3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Ber", 777, "Black");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("Brown");
        dog.voice();
    }
}

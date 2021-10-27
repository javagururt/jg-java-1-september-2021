package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_5;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog sharikDog = new Dog(7, "Black");

        sharikDog.voice();
        sharikDog.happyBirthday();
        sharikDog.changeColor("White");          //sharikDog.color = "White";
        sharikDog.voice();
   }
}

package com.javaguru.student_nikita_simans.homework.lesson_8.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 target = new DefaultConstructorV3();
        System.out.println( "Age = " + target.getAge());
        System.out.println("Full name = " + target.getFullName());
        System.out.println("IS Male = " + target.isMale());
        System.out.println("Is female = " + target.isFemale());
    }

}

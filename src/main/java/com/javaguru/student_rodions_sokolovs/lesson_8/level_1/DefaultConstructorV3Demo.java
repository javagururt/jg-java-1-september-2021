package com.javaguru.student_rodions_sokolovs.lesson_8.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV3Demo {
    public static void main(String[] args){
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.getMale());
        System.out.println(defaultConstructorV3.getFemale());
    }
}

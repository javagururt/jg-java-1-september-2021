package com.javaguru.student_ruslan_pankratov.lesson_8.level_1;

import com.javaguru.teacher.codereview.CodeReview;

//Task_3
@CodeReview(approved = true)
class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.getFemale());
        System.out.println(defaultConstructorV3.isMale());
        System.out.println(defaultConstructorV3.getFullName());
    }
}

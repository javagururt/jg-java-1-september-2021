package com.javaguru.student_dmitrii_faierberg.lesson_8.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 obj = new DefaultConstructorV3();
        System.out.println(obj.getFullName());
        System.out.println(obj.getAge());
        System.out.println(obj.getFemale());
        System.out.println(obj.isMale());
    }
}

package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;
    public static final double PI = 3.1415926536;

    double calculateArea(double radius) {
        double result = PI * radius * radius;
        return result;
    }
}

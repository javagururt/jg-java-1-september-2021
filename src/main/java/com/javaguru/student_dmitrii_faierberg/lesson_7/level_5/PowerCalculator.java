package com.javaguru.student_dmitrii_faierberg.lesson_7.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculator {
    public double pow(double number, int degree){
        double initial = number;
        if (degree == 0) {
            return 1;
        } else if (degree > 0) {
            for (int i = 1; i < degree; i++) {
                number *= initial;
            }
        } else if (degree < 0){
            for (int i = -1; i > degree; i--){
                number *= initial;
            }
            number = 1/number;
        }
        return number;
    }
}

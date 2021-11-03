package com.javaguru.student_nikita_simans.homework.lesson_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.shouldBeEven();
    }

    public void shouldBeEven() {
        Calculator target = new Calculator();
        if (target.isEven(8)) {
            System.out.println("shouldBeEven test -- OK");
        } else {
            System.out.println("shouldBeEven test -- FAIL");
        }

    }



}

package com.javaguru.student_dmitrii_faierberg.lesson_12.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException e) {

        } catch (Exception a) {

        }
        // Exception ловит все исключения, поэтому для более информативного результата его надо ставить в конец
    }
}

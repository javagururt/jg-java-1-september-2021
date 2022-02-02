package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TestException extends Exception {
}

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch (TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
//Got the Test Exception
//   Inside finally block

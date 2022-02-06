package com.javaguru.student_ruslan_pankratov.lesson_12.level_3;

class TestException extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
    //1
    //Got the Test Exception
    //Inside finally block
}

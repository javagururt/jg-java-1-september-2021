package com.javaguru.student_ruslan_pankratov.lesson_12.level_4;

class StackOverflowErrorTest {
    public static void main(String[] args) {
        StackOverflowErrorTest stack = new StackOverflowErrorTest();
        stack.method();
    }

    void method(){
        method();
    }
}

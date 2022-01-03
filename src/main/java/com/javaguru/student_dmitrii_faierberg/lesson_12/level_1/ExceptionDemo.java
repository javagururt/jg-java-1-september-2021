package com.javaguru.student_dmitrii_faierberg.lesson_12.level_1;

class ExceptionDemo {
    public static void main(String[] args) {
        MyException exception = new MyException("Exception");
        System.out.println(exception.getMessage());
    }
}

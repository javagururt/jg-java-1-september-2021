package com.javaguru.student_dmitrii_faierberg.lesson_10.level_3;

class UnaryOperationDemo {
    public static void main(String[] args) {
        UnaryOperationOnInt square = x -> x*x;
        System.out.println(square.apply(5));
    }
}

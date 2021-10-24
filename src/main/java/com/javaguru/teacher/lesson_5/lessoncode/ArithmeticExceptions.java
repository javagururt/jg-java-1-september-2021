package com.javaguru.teacher.lesson_5.lessoncode;

class ArithmeticExceptions {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 10;
//        int result = secondNumber/firstNumber;
//        System.out.println(result);

        double zero = 0.0;
        double secondResult = secondNumber / zero;
        System.out.println(secondResult);
    }
}

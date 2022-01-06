package com.javaguru.teacher.lesson_16_end.lessoncode;

class Fibonacci {

    //1 1 2 3 5 8 13 ...
    public static void main(String[] args) {
        int result1 = fibonacci(10000);
        System.out.println(result1);
        int result2 = fib(10000);
        System.out.println(result2);
    }

    private static int fibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        return result;
    }


    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }


}

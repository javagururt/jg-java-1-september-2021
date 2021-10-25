package com.javaguru.student_nikita_simans.homework.lesson_5;

public class ThreeRandomNumbersArrayPlusTwo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = (int) (Math.random() * 101);
        numbers[1] = (int) (Math.random() * 101);
        numbers[2] = (int) (Math.random() * 101);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        numbers[0] += 2;
        numbers[1] += 2;
        numbers[2] +=2;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }
}

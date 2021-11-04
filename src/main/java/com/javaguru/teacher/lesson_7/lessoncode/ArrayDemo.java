package com.javaguru.teacher.lesson_7.lessoncode;

import java.util.Arrays;

class ArrayDemo {

    public static void main(String[] args) {
        int[] array = {1, 3, 10, 12};
        Hamster hamster = new Hamster();
        System.out.println(hamster);
        System.out.println(Arrays.toString(array));
        System.out.println(array);
        System.out.println(array[0]);

        Hamster[] hamsters = new Hamster[2];
        hamsters[0] = new Hamster();
        hamsters[1] = new Hamster();

        System.out.println(hamsters);
        System.out.println(hamsters[0]);

        String[] strings = {"a", "b", "c"};
        Horse[] horses = {
                new Horse("White"),
                new Horse("Black")
        };
        for (int i = 0; i < horses.length; i++) {
            System.out.println("Horse color: " + horses[i].getColor());
        }

        ArrayUtils arrayUtils = new ArrayUtils();
        int[] numbers = arrayUtils.generateRandomSizeArray();
    }
}

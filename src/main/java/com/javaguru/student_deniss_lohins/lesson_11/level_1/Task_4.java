package com.javaguru.student_deniss_lohins.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class Task_4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            integers.add(i);
        }

        Long finish = System.currentTimeMillis();
        Long result = finish - start;
        System.out.println("Array size: " + integers.size());
        System.out.println("Result: " + result + " ms");
    }
}

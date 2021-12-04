package com.javaguru.teacher.lesson_11_collections.lessoncode;

import java.util.ArrayList;
import java.util.List;

class ArrayListAddToStartBenchmark {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            integers.add(0, i);
        }

        Long finish = System.currentTimeMillis();
        Long result = finish - start;
        System.out.println("Array size: " + integers.size());
        System.out.println("Result: " + result + " ms");
    }
}

package com.javaguru.teacher.lesson_11_collections.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LinkedListAddToEndBenchmark {

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
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

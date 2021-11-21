package com.javaguru.teacher.lesson_9_objects_equality.lessoncode;

class StringConcatBenchmark {

    public static void main(String[] args) {
        String result = "";
        Long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            result += "1";
        }

        Long finish = System.currentTimeMillis();

        Long timeConsumed = finish - start;

        System.out.println(timeConsumed + " ms");
    }
}

package com.javaguru.teacher.lesson_9_objects_equality.lessoncode;

class StringBuilderBenchmark {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            result.append("1");
        }

        Long finish = System.currentTimeMillis();

        Long timeConsumed = finish - start;

//        String strResult = result.toString();
//        System.out.println(strResult);
        System.out.println(timeConsumed + " ms");
    }
}

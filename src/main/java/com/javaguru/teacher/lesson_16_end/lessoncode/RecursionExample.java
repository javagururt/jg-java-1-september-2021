package com.javaguru.teacher.lesson_16_end.lessoncode;

class RecursionExample {

    public static void main(String[] args) {
//        printNumbersLoop(0, 100);
        printNumbersRec(0, 100);
    }

    private static void printNumbersLoop(int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.println(i);
        }
    }

    private static void printNumbersRec(int from, int to) {
        System.out.println(from);
        from++;
        if (from < to) {
            printNumbersRec(from, to);
        }
    }
}

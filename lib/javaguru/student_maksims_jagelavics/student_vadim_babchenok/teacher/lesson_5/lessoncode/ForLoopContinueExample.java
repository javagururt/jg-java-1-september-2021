package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_5.lessoncode;

class ForLoopContinueExample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (isOdd(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }
}

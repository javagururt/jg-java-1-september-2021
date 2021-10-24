package com.javaguru.teacher.lesson_5.lessoncode;

class ForLoopExample {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i % 2 != 0) {
                break;
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
    }
}

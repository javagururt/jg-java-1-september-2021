package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_15;

//Напишите бесконечный цикл при помощи while и for.

public class EndlessCycleForAndWhile {
    public static void main (String[] args) {
        for (int i = 0; i > -1; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i > -1) {
            System.out.println(i);
            i++;
        }
    }
}

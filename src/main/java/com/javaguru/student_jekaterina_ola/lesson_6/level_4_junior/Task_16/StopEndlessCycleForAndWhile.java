package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_16;

//Как выйти из бесконечного цикла?
//        Найдите в интернете и напишите пример кода
//        для циклов while и for.

public class StopEndlessCycleForAndWhile {
    public static void main (String[] args) {
        System.out.println("For loop");
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("While loop");
        int i = 0;
        while (i <= 50) {
            System.out.println(i);
            i++;
        }
    }
}

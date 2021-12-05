package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_17;

//Как досрочно закончить текущую итерацию цикла?
//        Найдите ответ в интернете и напишите пример кода
//        для циклов while и for.

public class AdvanceStopOfCurrentCycle {
    public static void main(String[] args) {
        System.out.println("For loop");
        for (int i = 0; i > -1; i++) {
            System.out.println(i);
            break;
        }
        System.out.println();

        System.out.println("While loop");
        int i = 0;
        while (i > -1) {
            System.out.println(i);
            i++;
            break;
        }
    }
}

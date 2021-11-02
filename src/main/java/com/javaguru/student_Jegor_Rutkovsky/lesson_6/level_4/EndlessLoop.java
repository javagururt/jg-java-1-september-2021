package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_4;

//Task_15 - Task_17
class EndlessLoop {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        while (a >= b) {
            System.out.println(a + " >= " + b);
            if (a > b) {
                break;
            }
        }

        for (a=5; a >= b; a++) {
            System.out.println("endless loop");
            if (a == 10){
                break;
            }
        }
    }
}

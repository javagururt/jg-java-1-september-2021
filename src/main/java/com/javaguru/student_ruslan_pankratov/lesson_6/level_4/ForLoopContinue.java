package com.javaguru.student_ruslan_pankratov.lesson_6.level_4;

//Task_17
class ForLoopContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            if (i > 15) {
                continue;
            }
            System.out.println(i);
        }
    }
}

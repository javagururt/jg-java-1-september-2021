package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

class BitwiseOperatorAnd {

    public static void main(String[] args) {
        //32 16 8 4 2 1 0
        //        1 0 1 0    = 5
        //        1 1 0 0    = 6
        //        1 0 0 0    = 4
        int a = 5;
        int b = 6;
        int result = a & b;
        System.out.println("Result = " + result);
    }
}

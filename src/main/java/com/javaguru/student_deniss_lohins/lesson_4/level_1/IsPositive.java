package com.javaguru.student_deniss_lohins.lesson_4.level_1;

import java.util.Scanner;

class IsPositive {
    private int inputNumber;


    int isPossitive(int inputNumber){
    if (inputNumber > 0){  // 1
        return 1;
    }else if ( inputNumber < 0){  // -1
        return -1;
    }else if (inputNumber == 0){
        return 0;  // 0
    }else{
        return 9;
    }
    }
}

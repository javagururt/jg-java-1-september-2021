package com.javaguru.student_Olga_T.lesson_4.level_7.task_2;

class LeapYear {
    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; //високосный год
        } else {
            return false;
        }
    }


}


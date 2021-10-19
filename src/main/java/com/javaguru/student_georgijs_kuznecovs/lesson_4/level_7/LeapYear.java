package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_7;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0){
            return false; //обычный
        } else if (year % 100 != 0){
            return true; //високосный
        } else if (year % 400 == 0){
            return true; //високосный
        } else
            return false; //обычный

    }
}

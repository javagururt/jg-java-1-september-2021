package com.javaguru.student_ruslan_pankratov.lesson_4.level_7;

//super_task_1
class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;

    }

}

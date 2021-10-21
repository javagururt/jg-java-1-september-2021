package com.javaguru.student_deniss_lohins.lesson_4.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    int year;

    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.

        this.year = year;

        if(year % 4 == 0){
            if(year % 100 == 0){
             if(year % 400 == 0){
                 return true;
             }else{
                 return false;
             }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}

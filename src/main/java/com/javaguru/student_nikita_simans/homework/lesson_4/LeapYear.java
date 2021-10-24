package com.javaguru.student_nikita_simans.homework.lesson_4;

import com.javaguru.teacher.codereview.CodeReview;

/*  // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.*/
@CodeReview(approved = true)
public class LeapYear {
   public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
       System.out.println(leapYear.isLeapYear(1900));



    }
    public boolean isLeapYear(int year) {
        if (!divFour(year)){
            return false;
        }
        if (!divHundred(year)){
            return true;
        }
        return divFourHundred(year);

    }

    private boolean divFour(int a){
        return (a % 4 == 0);
    }
    private boolean divHundred(int a){
        return  (a % 100 == 0);
    }
    private boolean divFourHundred(int a){
        return (a % 400 == 0);
    }
}

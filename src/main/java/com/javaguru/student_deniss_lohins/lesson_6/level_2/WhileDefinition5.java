package com.javaguru.student_deniss_lohins.lesson_6.level_2;

import com.javaguru.teacher.codereview.CodeReview;

/*Найдите логическую ошибку в программе и исправить её.
        Программа должна выводить числа от 1 до 100 на консоль.
*/
@CodeReview(approved = true)
class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

}
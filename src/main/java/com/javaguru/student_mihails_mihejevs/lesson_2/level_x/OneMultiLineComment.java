package com.javaguru.student_mihails_mihejevs.lesson_2.level_x;

import com.javaguru.teacher.codereview.CodeReview;

/*
Напишите программу и продемонстрируйте в ней использование
однострочного и многострочного коментариев.
 */
@CodeReview(approved = true)
public class OneMultiLineComment {

    public static void main(String[] args) {

        String sportsCommand1 = "Allez!";
        /* с фр.Начинайте!
        Команда в фехтовании.
        Сигнал о начале боя.
        */
        String sportsCommand2 = "Halte!"; // с фр.Стой! Команда в фехтовании. Остановка боя.

            System.out.println("Сигнал о начале боя - " + sportsCommand1);
            System.out.println("Сигнал об остановки боя - " + sportsCommand2);
    }
}


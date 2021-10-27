package com.javaguru.student_mihails_mihejevs.lesson_2.level_5;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

/*
Команда System.out.println("text"); выводит указанный "text"
на консоль, и переводит курсор на новую строку.

Для того, что бы выводить текст на консоль без перевода курсора на
новую строку можно воспользоваться командой
    System.out.print("text");
эта команда распечатает текст на консоль и оставит курсор в той же строке.

Напишите программу, которая демонстрирует использование команды
    System.out.print("text");
 */
@CodeReview(approved = true)
public class HwTask15 {

    public static void main (String[] args) {
        System.out.print("Hello! My date of birth is ");
        System.out.print("16.");
        System.out.print("06.");
        System.out.print("1979.");
    }
}

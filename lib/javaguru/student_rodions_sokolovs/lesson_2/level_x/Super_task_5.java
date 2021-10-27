//Напишите программу и продемонстрируйте в ней использование
//        однострочного и многострочного коментариев.

package com.javaguru.student_rodions_sokolovs.lesson_2.level_x;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Super_task_5 {
    public static void main(String[] args) {
        // Ниже вводим 1 число
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstnum = input.nextInt();
        /* Ниже вводим 2 число
        После чего программа решает все сама */
        System.out.println("Please enter second number: ");
        int secondnum = input.nextInt();

        int sumres = firstnum + secondnum;
        int subtrac = firstnum - secondnum;
        int divideres = firstnum / secondnum;
        int multiplyres = firstnum * secondnum;

        System.out.println("Sum result: " + sumres);
        System.out.println("Subtract result: " + subtrac);
        System.out.println("Divide result: " + divideres);
        System.out.println("Multiply result: " + multiplyres);

    }
}


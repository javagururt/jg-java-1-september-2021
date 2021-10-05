package com.javaguru.student_georgijs_kuznecovs.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Это была демоснтрация в начале. Один из студентов задал вопрос. Тема будет раскрыта на 4 занятии.")
public class L2Task8 {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String theName = sc.nextLine();

        System.out.println("Hello " + theName + "!");
 /*       if (theName.equalsIgnoreCase("+")) {              НЕ ПОНИМАЮ, ДЛЯ ЧЕГО ЭТА СТРОКА ???
            System.out.println(" WOW ");
        }  */
    }
}

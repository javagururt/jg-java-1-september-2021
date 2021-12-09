package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Напишите id, которое вы хотите удалить");
        Scanner scanner = new Scanner(System.in);
        Long author = scanner.nextLong();

        boolean result = bookDatabase.delete(author);
        System.out.println("Результат удаления книги по id" + result);

    }
}
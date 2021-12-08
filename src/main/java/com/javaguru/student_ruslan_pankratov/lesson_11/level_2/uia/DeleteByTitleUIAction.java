package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        int result = bookDatabase.countAllBooks();
        System.out.println("Количество книг " + result);
        System.out.println("Введите имя книги, которую хотите удалить");
        String title = scanner.nextLine();
        bookDatabase.deleteByTitle(title);
        result = bookDatabase.countAllBooks();
        System.out.println("Количество книг " + result);

    }
}

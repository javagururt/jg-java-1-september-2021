package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.Book;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите имя автора");
        String author = scanner.nextLine();
        System.out.println("Напишите название книги");
        String title = scanner.nextLine();
        System.out.println("Напишите год книги");
        String year = scanner.nextLine();
        Book book = new Book(author, title);
        book.setYearOfIssue(year);

        bookDatabase.save(book);

    }

}

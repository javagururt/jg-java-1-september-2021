package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.Book;
import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Save book";

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author, title and year of issue of the book:");

        String author = scanner.next();
        String title = scanner.next();
        String year = scanner.next();

        Book book = new Book(author, title);
        book.setYearOfIssue(year);

        bookDatabase.save(book);
        System.out.println("The book is saved.");
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}

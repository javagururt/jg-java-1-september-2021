package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.Book;
import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
@CodeReview(approved = true)
class FindByAuthorUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Find books by author";

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an author of the book:");
        String author = scanner.nextLine();

        List<Book> books = bookDatabase.findByAuthor(author);

        if (books != null){
            int length = books.size();
            System.out.println("Books were found: " + length);
            for(Book book : books){
                System.out.println(book);
            }
        } else {
            System.out.println("There are no book of this author.");
        }

    }

    public String getActionName() {
        return ACTION_NAME;
    }
}

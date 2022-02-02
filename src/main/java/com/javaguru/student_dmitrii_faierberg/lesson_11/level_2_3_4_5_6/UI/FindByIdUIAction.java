package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.Book;
import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Optional;
import java.util.Scanner;
@CodeReview(approved = true)
class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Find books by id";

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of the book:");
        long id = scanner.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()){
            Book book = bookOpt.get();
            System.out.println("The book was found: " + book);
        } else {
            System.out.println("There is no book with this id.");
        }

    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}

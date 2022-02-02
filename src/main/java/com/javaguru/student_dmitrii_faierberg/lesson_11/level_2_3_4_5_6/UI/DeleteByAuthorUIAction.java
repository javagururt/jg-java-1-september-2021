package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class DeleteByAuthorUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Delete a book by author";

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter author to delete the book:");
        String author = sc.nextLine();
        bookDatabase.deleteByAuthor(author);
        System.out.println("The book deleted");
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}

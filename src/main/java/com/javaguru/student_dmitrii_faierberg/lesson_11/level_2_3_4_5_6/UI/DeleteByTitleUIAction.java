package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Delete books by title";

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title to delete the book:");
        String title = sc.nextLine();
        bookDatabase.deleteByTitle(title);
        System.out.println("The book deleted");
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}

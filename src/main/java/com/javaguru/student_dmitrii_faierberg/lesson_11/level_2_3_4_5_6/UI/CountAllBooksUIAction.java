package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.Scanner;

class CountAllBooksUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Count all books";

    public CountAllBooksUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        System.out.println("The number of books in database is: " + bookDatabase.countAllBooks());
    }

    public String getActionName() {
        return ACTION_NAME;
    }
}

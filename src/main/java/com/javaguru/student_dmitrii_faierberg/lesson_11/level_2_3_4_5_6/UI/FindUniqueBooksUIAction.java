package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.Book;
import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.List;

class FindUniqueBooksUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Find unique books";

    public FindUniqueBooksUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        int length = bookDatabase.findUniqueBooks().size();
        System.out.println("Unique books are: " + length);
        List<Book> list = bookDatabase.findUniqueBooks().stream().toList();
        for (int i = 0; i < length; i++){
            System.out.println(list.get(i));
        }
    }

    public String getActionName() {
        return ACTION_NAME;
    }
}

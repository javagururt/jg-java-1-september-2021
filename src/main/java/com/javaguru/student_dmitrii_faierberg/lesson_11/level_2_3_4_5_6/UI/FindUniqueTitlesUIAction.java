package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.Book;
import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;

import java.util.List;
import java.util.Set;

class FindUniqueTitlesUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Find unique titles";

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    public void execute(){
        int length = bookDatabase.findUniqueTitles().size();
        System.out.println("Unique titles are: " + length);
        List<String> list = bookDatabase.findUniqueTitles().stream().toList();
        for (int i = 0; i < length; i++){
            System.out.println(list.get(i));
        }
    }

    public String getActionName() {
        return ACTION_NAME;
    }
}

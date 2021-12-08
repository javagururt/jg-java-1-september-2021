package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.Book;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;

import java.util.List;
import java.util.Map;

public class GetAuthorToBooksMapUIAction implements UIAction {

    BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, List<Book>> result = bookDatabase.getAuthorToBooksMap();
        for (Object o : result.entrySet()) {
            System.out.println(o.toString());
        }

    }
}

package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.Book;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Set;
@CodeReview(approved = true)
public class FindUniqueBooksUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Список индивидуальных книг");
        Set<Book> result = bookDatabase.findUniqueBooks();

        for (Object o: result ) {
            System.out.println(o.toString());
        }
    }
}

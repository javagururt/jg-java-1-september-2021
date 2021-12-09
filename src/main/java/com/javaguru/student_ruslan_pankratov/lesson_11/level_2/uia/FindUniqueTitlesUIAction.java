package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Set;
@CodeReview(approved = true)
public class FindUniqueTitlesUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Индивидуальные названия книг, библиотеки");
        Set<String> result = bookDatabase.findUniqueTitles();

        for (Object o : result) {
            System.out.println(o);
        }
    }
}

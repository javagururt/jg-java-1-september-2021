package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Map;
@CodeReview(approved = true)
public class GetEachAuthorBookCountUIAction implements UIAction {


    BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Количество уникальных книг автора ");
        Map<String, Integer> result = bookDatabase.getEachAuthorBookCount();

        for (Object o : result.entrySet()) {
            System.out.println(o);
        }
    }
}

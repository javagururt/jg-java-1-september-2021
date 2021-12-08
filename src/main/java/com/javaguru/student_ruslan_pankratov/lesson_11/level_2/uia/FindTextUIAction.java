package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;


import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
import java.util.Set;
@CodeReview(approved = true)
public class FindTextUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindTextUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Напишите текст, чтобы найти только индивидуальные слова в тексте");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Set<String> result = bookDatabase.find(text);

        for (Object o : result) {
            System.out.println(o);
        }

    }
}

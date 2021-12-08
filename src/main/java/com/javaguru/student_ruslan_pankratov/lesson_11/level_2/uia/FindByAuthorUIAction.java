package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.Book;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Напишите имя автора");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(author);
        System.out.println("Книги автора " + author);
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

    }
}

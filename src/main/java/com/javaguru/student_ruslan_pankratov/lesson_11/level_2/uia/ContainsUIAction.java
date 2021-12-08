package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.Book;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class ContainsUIAction implements UIAction {

    BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поиск существует ли книга в библиотеке");
        System.out.println("Напишите имя автора");
        String name = scanner.nextLine();
        System.out.println("Напишите название книги");
        String title = scanner.nextLine();
        System.out.println("Напишите год книги");
        String year = scanner.nextLine();

        Book book = new Book(name, title);
        book.setYearOfIssue(year);


        boolean result = bookDatabase.contains(book);
        if (result) {
            System.out.println("Книга есть в библиотеке");
        } else {
            System.out.println("Книги нет в библиотеке");
        }
    }
}

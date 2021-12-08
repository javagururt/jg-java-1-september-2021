package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.Book;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.BookDatabase;
import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.UIAction;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    public void execute() {
        System.out.println("Напишите имя книги");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByTitle(title);
        System.out.println("Книги похожие по названию " + title);


        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }



    }
}

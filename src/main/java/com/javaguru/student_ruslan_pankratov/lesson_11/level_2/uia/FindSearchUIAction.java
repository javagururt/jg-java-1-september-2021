package com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.*;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindSearchUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindSearchUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        SearchCriteria searchCriteria;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ поиска");
        System.out.println("1 = поиск по имени автора");
        System.out.println("2 = поиск по названию книги");
        System.out.println("3 или 3> = поиск по году");
        int count = scanner.nextInt();
        if (count == 1) {
            System.out.println("Введите имя книги");
            String nameAuthor = scanner.nextLine();
            AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria(nameAuthor);
            searchCriteria = authorSearchCriteria;
            List<Book> result = bookDatabase.find(searchCriteria);
            out(result);
        } else if (count == 2) {
            System.out.println("Введите имя автора");
            String nameTitle = scanner.nextLine();
            TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria(nameTitle);
            searchCriteria = titleSearchCriteria;
            List<Book> result = bookDatabase.find(searchCriteria);
            out(result);
        } else {
            System.out.println("Введите год книги");
            String nameTitle = scanner.nextLine();
            YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria(nameTitle);
            searchCriteria = year;
            List<Book> result = bookDatabase.find(searchCriteria);
            out(result);
        }


    }

    void out(List<Book> result) {
        for (Object o : result) {
            System.out.println(o.toString());
        }

    }
}

package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class SearchCriteriaTest {

@Test public
    void findPage() {
        BookDatabaseImpl bookDatabase = bookDatabase();

        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("10");
        Paging paging = new Paging(3);
        Map<Integer, List<Book>> find = bookDatabase.find(year, paging);

        Book book6 = new Book("a", "jir2");
        book6.setYearOfIssue("10");
        Book book7 = new Book("b", "jir1");
        book7.setYearOfIssue("10");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book6);
        expectedResult.add(book7);

        assertArrayEquals(find.get(2).toArray(), expectedResult.toArray());


    }
    @Test public
    void sortTest() {
        BookDatabaseImpl bookDatabase = bookDatabase();
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("10");
        Paging paging = new Paging(3);

        Map<Integer, List<Book>> find = bookDatabase.find(year, paging, true);

        Book book6 = new Book("a", "jir2");
        book6.setYearOfIssue("10");
        Book book2 = new Book("a", "jir3");
        book2.setYearOfIssue("10");
        Book book7 = new Book("b", "jir1");
        book7.setYearOfIssue("10");

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book6);
        expectedResult.add(book2);
        expectedResult.add(book7);

        assertArrayEquals(find.get(0).toArray(), expectedResult.toArray());
    }



    BookDatabaseImpl bookDatabase() {
        Book book = new Book("z", "jir17");
        book.setYearOfIssue("10");
        Book book1 = new Book("z", "jir8");
        book1.setYearOfIssue("10");
        Book book2 = new Book("a", "jir3");
        book2.setYearOfIssue("10");
        Book book3 = new Book("b", "jir5");
        book3.setYearOfIssue("10");
        Book book4 = new Book("t", "jir17");
        book4.setYearOfIssue("10");
        Book book5 = new Book("te", "jir8");
        book5.setYearOfIssue("10");
        Book book6 = new Book("a", "jir2");
        book6.setYearOfIssue("10");
        Book book7 = new Book("b", "jir1");
        book7.setYearOfIssue("10");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);
        bookDatabase.save(book7);

        return bookDatabase;

    }
}
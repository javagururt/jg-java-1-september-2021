package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndSearchCriteriaTest {

    @Test
    public void matchTest(){
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        BookDatabaseImpl.setSequenceId(1);
        AndSearchCriteria searchCriteria = new AndSearchCriteria(new YearOfIssueSearchCriteria("2007"),
                new TitleSearchCriteria("3B"));

        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("2A", "2B");
        Book book3 = new Book("3A", "3B");
        book1.setYearOfIssue("1999");
        book2.setYearOfIssue("1857");
        book3.setYearOfIssue("2007");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        assertTrue(searchCriteria.match(book3));
    }

}
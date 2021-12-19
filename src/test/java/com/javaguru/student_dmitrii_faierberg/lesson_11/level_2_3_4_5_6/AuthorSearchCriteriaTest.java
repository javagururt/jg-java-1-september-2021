package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    @Test
    public void matchTest(){
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        BookDatabaseImpl.setSequenceId(1);
        AuthorSearchCriteria authorToSearch = new AuthorSearchCriteria("2A");
        Book book2 = new Book("2A", "2B");
        bookDatabase.save(new Book("1A", "1B"));
        bookDatabase.save(book2);
        bookDatabase.save(new Book("3A", "3B"));
        assertTrue(authorToSearch.match(book2));


    }

}
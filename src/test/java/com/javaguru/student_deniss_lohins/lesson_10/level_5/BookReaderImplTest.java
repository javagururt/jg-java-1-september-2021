package com.javaguru.student_deniss_lohins.lesson_10.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void addBook() {
        Book victim1 = new Book("Test Author", "Test title");
        BookReaderImpl bookReader = new BookReaderImpl();
        assertTrue(bookReader.addBook(victim1));
    }

    @Test
    public void addSeveralBooks(){
        Book victim1 = new Book("Test Author", "test1");
        Book victim2 = new Book("Test Author", "test2");
        BookReaderImpl bookReader = new BookReaderImpl();
        assertTrue(bookReader.addBook(victim1));
        assertTrue(bookReader.addBook(victim2));
    }

    @Test
    public void notAddBookIfPresent(){
        Book victim1 = new Book("Test Author", "test1");
        Book victim2 = new Book("Test Author", "test2");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(victim1);
        bookReader.addBook(victim2);
        assertFalse(bookReader.addBook(victim1));
        assertFalse(bookReader.addBook(victim2));
    }

    @Test
    public void notAddBookWithEmptyName(){
        Book victim1 = new Book("Test Author", "");
        BookReaderImpl bookReader = new BookReaderImpl();
        assertFalse(bookReader.addBook(victim1));
    }
    @Test
    public void notAddBookWithEmptyAuthor(){
        Book victim1 = new Book("", "TestBook");
        BookReaderImpl bookReader = new BookReaderImpl();
        assertFalse(bookReader.addBook(victim1));
    }
    @Test
    public void removeBook(){
        Book victim1 = new Book("Test Author", "TestBook");
        Book victim2 = new Book("Test Author", "test2");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(victim1);
        bookReader.addBook(victim2);
        assertTrue(bookReader.removeBook(victim1));
    }
    @Test
    public void notRemoveBookIfNotPresent(){
        Book victim1 = new Book("Test Author", "TestBook");
        Book victim2 = new Book("Test Author", "test2");
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(victim1);
        assertFalse(bookReader.removeBook(victim2));

    }

}
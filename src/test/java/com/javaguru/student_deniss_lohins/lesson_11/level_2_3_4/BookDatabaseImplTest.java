package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void save() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        long obtainedResult = victim.save(book1);
        long expectedResult = 1;
        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void delete() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        victim.save(book1);
        assertTrue(victim.delete(book1));
    }

    @Test
    public void testDelete() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        victim.save(book1);
        long number = 1;
        assertTrue(victim.delete(number));
    }

    @Test
    public void findById() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");
        Book book4 = new Book("A4", "B4");
        Book book5 = new Book("A5", "B5");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        long number = 2;
        Optional<Book> actualResult = victim.findById(number);
        Optional<Book> expectedResult = Optional.ofNullable(book2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findByAuthor() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");
        Book book4 = new Book("A4", "B4");
        Book book5 = new Book("A5", "B5");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        List<Book> actualResult = victim.findByAuthor("A2");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findByTitle() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");
        Book book4 = new Book("A4", "B4");
        Book book5 = new Book("A5", "B5");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        List<Book> actualResult = victim.findByTitle("B3");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countAllBooks() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");
        Book book4 = new Book("A4", "B4");
        Book book5 = new Book("A5", "B5");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        int expectedResult = 5;
        assertEquals(expectedResult, victim.countAllBooks());
    }

    @Test
    public void deleteByAuthor() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");
        Book book4 = new Book("A2", "B4");
        Book book5 = new Book("A2", "B5");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        int expectedResult = 2;
        victim.deleteByAuthor("A2");
        assertEquals(expectedResult, victim.countAllBooks());
    }

    @Test
    public void deleteByTitle() {
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B1");
        Book book3 = new Book("A3", "B3");
        Book book4 = new Book("A2", "B1");
        Book book5 = new Book("A2", "B5");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        int expectedResult = 2;
        victim.deleteByTitle("b1");
        assertEquals(expectedResult, victim.countAllBooks());
    }

    @Test
    public void find(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B1");
        Book book3 = new Book("A3", "B3");
        Book book4 = new Book("A2", "B1");
        Book book5 = new Book("A2", "B5");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        expectedResult.add(book4);
        expectedResult.add(book5);
        List<Book> obtainedResult = victim.find(new AuthorSearchCriteria("A2"));
        assertEquals(expectedResult, obtainedResult);
    }
}
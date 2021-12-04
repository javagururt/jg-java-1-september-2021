package com.javaguru.student_ruslan_pankratov.lesson_10.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void addingBooksToTheElectronicLibraryTrueTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        Book book = new Book("Mount", "Gari");
        boolean result = bookReader.addingBooksToTheElectronicLibrary(book);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void addingBooksToTheElectronicLibraryFalseTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        Book book = new Book("War", "Jhon");
        boolean result = bookReader.addingBooksToTheElectronicLibrary(book);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void existNameFalseTest() {

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        Book book = new Book();
        boolean result = bookReader.addingBooksToTheElectronicLibrary(book);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void existNameFalseOneNameTest() {

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        Book book = new Book("Rik");
        boolean result = bookReader.addingBooksToTheElectronicLibrary(book);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void deleteBookTrueTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        Book book = new Book("War", "Jhon");
        boolean result = bookReader.deleteBook(book);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void deleteBookFalseTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        Book book = new Book("We", "Be");
        boolean result = bookReader.deleteBook(book);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void listOfAllBooksTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();

        String result = bookReader.listOfAllBooks();
        String expectedResult = "War[Miller] \n" +
                "War[Jhon] \n" +
                "Castle[Miller] \n" +
                "See[Miller] \n" +
                "Phone[Mill Gir] \n" +
                "Car Read[Miller] \n";

        assertEquals(expectedResult, result);


    }

    @Test
    public void authorSearchTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        String result = bookReader.authorSearch("Miller");
        String expectedResult = "War Castle See Car Read ";

        assertEquals(expectedResult, result);

    }

    @Test
    public void authorSearchFailTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        String result = bookReader.authorSearch("Mil");
        String expectedResult = "";

        assertEquals(expectedResult, result);

    }

    @Test
    public void authorSearchNewTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        String result = bookReader.authorSearch("Mill");
        String expectedResult = "Phone ";

        assertEquals(expectedResult, result);

    }

    @Test
    public void searchBookName() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        String result = bookReader.searchBookName("see");
        String expectedResult = "Name Book = [See] Name Author = [Miller], ";

        assertEquals(expectedResult, result);

    }

    @Test
    public void searchBookNameTwo() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        String result = bookReader.searchBookName("Car");
        String expectedResult = "Name Book = [Car Read] Name Author = [Miller], ";

        assertEquals(expectedResult, result);

    }

    @Test
    public void readBookMethodTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        boolean result = bookReader.readBookMethod("War", "Miller");
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void readBookMethodFailTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        boolean result = bookReader.readBookMethod("W2", "Mil2r");
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void notReadBookMethod() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        boolean result = bookReader.notReadBookMethod("See", "Miller");
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void notReadBookMethodTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        boolean result = bookReader.notReadBookMethod("Se2e", "Mier");
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void readBookListTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        bookReader.readBookMethod("See", "Miller");
        String result = bookReader.readBookList();
        String expectedResult = "Название книги = See[Miller]";

        assertEquals(expectedResult, result);

    }

    @Test
    public void notReadBookListTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.createLibrary();
        bookReader.notReadBookMethod("War", "Jhon");
        String result = bookReader.notReadBookList();
        String expectedResult = "Название книги = War[Jhon]";

        assertEquals(expectedResult, result);

    }

}
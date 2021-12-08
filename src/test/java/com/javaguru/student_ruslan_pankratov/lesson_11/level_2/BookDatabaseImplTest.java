package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {


    @Test
    public void saveTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "3");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        int result = bookDatabase.save(book1).intValue();

        int expectedResult = 2;
        assertEquals(expectedResult,result);
    }


    @Test
    public void deleteTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "3");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);

        boolean result = bookDatabase.delete(1l);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);

    }


    @Test
    public void deleteBookTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "3");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);

        boolean result = bookDatabase.delete(book);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);

    }


    @Test
    public void findByIdTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "3");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);

        Optional<Book> result = bookDatabase.findById(0L);
        Optional<Book> expectedResult = Optional.of(book);

        assertEquals(expectedResult,result);

    }


    @Test
    public void findByAuthorTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "3");
        Book book2 = new Book("2", "Red");
        Book book3 = new Book("2", "Blue");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        List<Book> result = bookDatabase.findByAuthor("2");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book2);
        expectedResult.add(book3);

        assertArrayEquals(expectedResult.toArray(),result.toArray());

    }


    @Test
    public void findByTitleTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "Red");
        Book book2 = new Book("2", "Red");
        Book book3 = new Book("2", "Blue");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        List<Book> result = bookDatabase.findByTitle("red");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);

        assertArrayEquals(expectedResult.toArray(),result.toArray());

    }

    @Test
    public void countAllBooksTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "Red");
        Book book2 = new Book("2", "Red");
        Book book3 = new Book("2", "Blue");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        int result = bookDatabase.countAllBooks();
        int expectedResult = 4;

        assertEquals(expectedResult,result);
    }

    @Test
    public void deleteByAuthorTest() {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "Red");
        Book book2 = new Book("2", "Red");
        Book book3 = new Book("2", "Blue");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        bookDatabase.deleteByAuthor("2");

        int result = bookDatabase.countAllBooks();
        int expectedResult = 1;
        assertEquals(expectedResult,result);

    }

    @Test
    public void deleteByTitleTest() {

        Book book = new Book("2", "1");
        Book book1 = new Book("4", "Red");
        Book book2 = new Book("2", "Red");
        Book book3 = new Book("2", "Blue");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);


        bookDatabase.deleteByTitle("red");

        int result = bookDatabase.countAllBooks();
        int expectedResult = 2;
        assertEquals(expectedResult,result);

    }

    @Test
    public void matchTest() {
        Book book = new Book("2", "1");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("2");

        boolean result = authorSearchCriteria.match(book);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);
    }

    @Test
    public void titleSearchCriteriaMatchTest() {
        Book book = new Book("2", "1");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("1");

        boolean result = titleSearchCriteria.match(book);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);
    }

    @Test
    public void titleSearchCriteriaMatchTestFalse() {
        Book book = new Book("2", "1");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("233");

        boolean result = titleSearchCriteria.match(book);
        boolean expectedResult = false;

        assertEquals(expectedResult,result);

    }

    @Test
    public void yearOfIssueSearchCriteriaTest() {
        Book book = new Book("2", "1");
        book.setYearOfIssue("1976");
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("1976");

        boolean result = year.match(book);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);


    }

    @Test
    public void andSearchCriteriaTest() {
        Book book = new Book("2", "1");
        book.setYearOfIssue("1976");
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("1976");
        TitleSearchCriteria title = new TitleSearchCriteria("1");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(year, title);

        boolean result = andSearchCriteria.match(book);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);

    }

    @Test
    public void andSearchCriteriaTestFalse() {
        Book book = new Book("2", "1231");
        book.setYearOfIssue("1976");
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("1976");
        TitleSearchCriteria title = new TitleSearchCriteria("1");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(year, title);

        boolean result = andSearchCriteria.match(book);
        boolean expectedResult = false;

        assertEquals(expectedResult,result);


    }

    @Test
    public void OrSearchCriteriaTest() {
        Book book = new Book("2", "1231");
        book.setYearOfIssue("1976");
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("1976");
        TitleSearchCriteria title = new TitleSearchCriteria("1");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(year, title);

        boolean result = orSearchCriteria.match(book);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);


    }

    @Test
    public void OrSearchCriteriaTestFail() {
        Book book = new Book("2", "1231");
        book.setYearOfIssue("1999");
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("1976");
        TitleSearchCriteria title = new TitleSearchCriteria("1");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(year, title);

        boolean result = orSearchCriteria.match(book);
        boolean expectedResult = false;

        assertEquals(expectedResult,result);

    }

    @Test
    public void find() {
        Book book = new Book("2", "1231");
        book.setYearOfIssue("1976");

        Book book1 = new Book("1", "122");
        book1.setYearOfIssue("1976");

        Book book2 = new Book("2", "122");
        book2.setYearOfIssue("1972");


        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("1976");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);


        List<Book> result = bookDatabase.find(year);

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book1);

        assertArrayEquals(expectedResult.toArray(),result.toArray());
    }

    @Test
    public void findUniqueAuthorsTest() {
        Book book = new Book("2", "1231");
        book.setYearOfIssue("1976");

        Book book1 = new Book("1", "122");
        book1.setYearOfIssue("1976");

        Book book2 = new Book("2", "122");
        book2.setYearOfIssue("1972");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Set<String> result = bookDatabase.findUniqueAuthors();

        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book.getAuthor());
        expectedResult.add(book1.getAuthor());


        assertArrayEquals(expectedResult.toArray(),result.toArray());


    }

    @Test
    public void findUniqueTitlesTest() {
        Book book = new Book("2", "1231");
        book.setYearOfIssue("1976");

        Book book1 = new Book("1", "122");
        book1.setYearOfIssue("1976");

        Book book2 = new Book("2", "122");
        book2.setYearOfIssue("1972");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Set<String> result = bookDatabase.findUniqueTitles();

        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book.getTitle());
        expectedResult.add(book1.getTitle());

        assertArrayEquals(expectedResult.toArray(),result.toArray());
    }

    @Test
    public void findUniqueBooksTest() {

        Book book = new Book("2", "1231");
        book.setYearOfIssue("1976");

        Book book1 = new Book("1", "122");
        book1.setYearOfIssue("1976");

        Book book2 = new Book("2", "122");
        book2.setYearOfIssue("1972");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Set<Book> result = bookDatabase.findUniqueBooks();

        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book);
        expectedResult.add(book1);
        expectedResult.add(book2);

        assertArrayEquals(expectedResult.toArray(),result.toArray());
    }


    @Test
    public void containsTest() {

        Book book = new Book("2", "1231");
        book.setYearOfIssue("1976");

        Book book1 = new Book("1", "122");
        book1.setYearOfIssue("1976");

        Book book2 = new Book("2", "122");
        book2.setYearOfIssue("1972");

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        boolean result = bookDatabase.contains(book);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);

    }


    @Test
    public void findTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        String text = "hello hello red bull i i hello winter winterrrr";

        Set<String> result = bookDatabase.find(text);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("hello");
        expectedResult.add("red");
        expectedResult.add("bull");
        expectedResult.add("i");
        expectedResult.add("winter");
        expectedResult.add("winterrrr");


        assertArrayEquals(expectedResult.toArray(),result.toArray());
    }


    @Test
    public void getAuthorToBooksMapTest() {
        Book book = new Book("2", "1231");
        Book book1 = new Book("1", "122");
        Book book2 = new Book("2", "122");

        List<Book> bookList1 = new ArrayList<>();
        bookList1.add(book1);

        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(book);
        bookList2.add(book2);

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Map<String, List<Book>> result = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put("1", bookList1);
        expectedResult.put("2", bookList2);

        assertEquals(expectedResult,result);
    }

    @Test
    public void getEachAuthorBookCountTest() {

        Book book = new Book("2", "1231");
        Book book1 = new Book("1", "122");
        Book book2 = new Book("2", "122");

        List<Book> bookList1 = new ArrayList<>();
        bookList1.add(book1);

        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(book);
        bookList2.add(book2);

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Map<String, Integer> result = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("1", 1);
        expectedResult.put("2", 2);

        assertEquals(expectedResult,result);
    }

}
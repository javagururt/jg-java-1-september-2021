package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl bookDatabase;

    @Before
    public void setUp(){
        bookDatabase = new BookDatabaseImpl();
        BookDatabaseImpl.setSequenceId(1);
    }

    @Test
    public void deleteElementByIdTest(){
        bookDatabase.save(new Book("1A", "1B"));
        bookDatabase.save(new Book("2A", "2B"));
        bookDatabase.save(new Book("3A", "3B"));
        assertTrue(bookDatabase.delete(2L));
        assertEquals(2, bookDatabase.database.size());
    }

    @Test
    public void deleteElementByBookTest(){
        Book victim = new Book("2A", "2B");
        bookDatabase.save(new Book("1A", "1B"));
        bookDatabase.save(victim);
        bookDatabase.save(new Book("3A", "3B"));

        assertTrue(bookDatabase.delete(victim));
        //assertEquals(2, bookDatabase.database.size());
    }

    @Test
    public void findByIdTest(){
        Book victim = new Book("2A", "2B");
        bookDatabase.save(new Book("1A", "1B"));
        bookDatabase.save(victim);
        bookDatabase.save(new Book("3A", "3B"));
        Optional<Book> optional = bookDatabase.findById(2L);

        if (optional.isEmpty()){
            throw new AssertionError("Book not found");
        } else {
            assertEquals(victim, optional.get());
        }
    }

    @Test
    public void findByAuthorTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("2A", "2B");
        Book book3 = new Book("2A", "3B");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        List<Book> actual = new ArrayList<>();
        actual = bookDatabase.findByAuthor("2A");
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book3);
        assertEquals(expected, actual);
    }

    @Test
    public void findByTitleTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("2A", "3B");
        Book book3 = new Book("3A", "3B");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        List<Book> actual = new ArrayList<>();
        actual = bookDatabase.findByTitle("3B");
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book3);
        assertEquals(expected, actual);
    }

    @Test
    public void countAllBooksTest(){
        bookDatabase.save(new Book("1A", "1B"));
        bookDatabase.save(new Book("2A", "2B"));
        bookDatabase.save(new Book("3A", "3B"));
        int actual = bookDatabase.countAllBooks();
        assertEquals(3L, actual);
    }

    @Test
    public void deleteByAuthorTest(){
        bookDatabase.save(new Book("1A", "1B"));
        bookDatabase.save(new Book("2A", "2B"));
        bookDatabase.save(new Book("2A", "3B"));
        bookDatabase.deleteByAuthor("2A");
        assertEquals(1, bookDatabase.database.size());
    }

    @Test
    public void deleteByTitleTest(){
        bookDatabase.save(new Book("1A", "1B"));
        bookDatabase.save(new Book("2A", "2B"));
        bookDatabase.save(new Book("3A", "2B"));
        bookDatabase.deleteByTitle("2B");
        assertEquals(1, bookDatabase.database.size());
    }

    @Test
    public void findTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("2A", "2B");
        Book book3 = new Book("3A", "3B");
        Book book4 = new Book("4A", "4B");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("2A");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("4B");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        List<Book> actual = bookDatabase.find(searchCriteria);
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book4);

        assertEquals(expected, actual);
    }

    @Test
    public void findUniqueAuthorsTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("1A", "2B");
        Book book3 = new Book("3A", "3B");
        Book book4 = new Book("4A", "4B");
        Book book5 = new Book("4A", "5B");
        Book book6 = new Book("2A", "6B");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);

        Set<String> actual = bookDatabase.findUniqueAuthors();
        Set<String> expected = new HashSet<>();
        expected.add("1A");
        expected.add("2A");
        expected.add("3A");
        expected.add("4A");
        assertEquals(expected, actual);
    }

    @Test
    public void findUniqueTitlesTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("2A", "1B");
        Book book3 = new Book("3A", "2B");
        Book book4 = new Book("4A", "4B");
        Book book5 = new Book("5A", "4B");
        Book book6 = new Book("6A", "6B");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);

        Set<String> actual = bookDatabase.findUniqueTitles();
        Set<String> expected = new HashSet<>();
        expected.add("1B");
        expected.add("2B");
        expected.add("4B");
        expected.add("6B");
        assertEquals(expected, actual);
    }

    @Test
    public void findUniqueBooksTest(){
        Book book1 = new Book("1A", "1B");
        Book book3 = new Book("3A", "3B");
        Book book4 = new Book("4A", "4B");
        Book book6 = new Book("6A", "6B");

        bookDatabase.save(book1);
        bookDatabase.save(book1);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book4);
        bookDatabase.save(book6);

        Set<Book> actual = bookDatabase.findUniqueBooks();
        Set<Book> expected = new HashSet<>();
        expected.add(book1);
        expected.add(book3);
        expected.add(book4);
        expected.add(book6);
        assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("2A", "1B");
        Book book3 = new Book("3A", "2B");
        Book book4 = new Book("4A", "4B");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        assertTrue(bookDatabase.contains(book1));
        assertTrue(bookDatabase.contains(book2));
        assertTrue(bookDatabase.contains(book3));
        assertFalse(bookDatabase.contains(book4));
    }

    @Test
    public void getAuthorToBooksMapTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("1A", "2B");
        Book book3 = new Book("2A", "3B");
        Book book4 = new Book("3A", "4B");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Map<String, List<Book>> actual = new HashMap<>();
        actual = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expected  = new HashMap<>();

        expected.put("1A", List.of(book1, book2));
        expected.put("2A", List.of(book3));
        expected.put("3A", List.of(book4));

        assertEquals(expected, actual);
    }

    @Test
    public void getEachAuthorBookCountTest(){
        Book book1 = new Book("1A", "1B");
        Book book2 = new Book("1A", "2B");
        Book book3 = new Book("2A", "3B");
        Book book4 = new Book("3A", "4B");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book4);

        Map<String, Integer> actual = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("1A", 2);
        expected.put("2A", 1);
        expected.put("3A", 1);

        assertEquals(expected, actual);
    }

}
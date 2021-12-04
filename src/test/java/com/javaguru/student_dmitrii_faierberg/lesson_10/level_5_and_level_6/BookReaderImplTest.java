package com.javaguru.student_dmitrii_faierberg.lesson_10.level_5_and_level_6;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BookReaderImplTest {
    @Before
    public void setUp(){
        BooksDatabase.allBooks = null;
    }

    @Test
    public void addDuplicateBookTest(){

        BookReaderImpl victim = new BookReaderImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        assertTrue(victim.addBook(book1));
        assertTrue(victim.addBook(book2));

        int length = BooksDatabase.allBooks.length;
        assertEquals(length, 2);

        assertFalse(victim.addBook(book1));
        length = BooksDatabase.allBooks.length;
        assertEquals(length, 2);

    }

    @Test
    public void addBookWithoutSignature(){
        BookReaderImpl victim = new BookReaderImpl();
        Book book1 = new Book("1", "");
        Book book2 = new Book("", "2");

        assertFalse(victim.addBook(book1));
        assertFalse(victim.addBook(book2));
    }

    @Test
    public void deleteBookTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");

        assertFalse(victim.deleteBook(book1));

        victim.addBook(book1);
        victim.addBook(book2);

        assertTrue(victim.deleteBook(book2));
        assertFalse(victim.deleteBook(book3));

        assertEquals(1, BooksDatabase.allBooks.length);


    }

    @Test
    public void showAllBooksTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("The adventures of Sherlock Holmes", "A.C.Doyle");
        Book book3 = new Book("The Odyssey", "Homer");

        victim.addBook(book1);
        victim.addBook(book2);
        victim.addBook(book3);

        String[] formattedAllBooks = victim.showAllBooks();
        /*for (String book : formattedAllBooks){
            System.out.println(book);
        }*/

        String[] expected = { "Harry Potter [J.K.Rowling]",
                            "The adventures of Sherlock Holmes [A.C.Doyle]",
                            "The Odyssey [Homer]"};
        assertArrayEquals(expected, formattedAllBooks);
    }

    @Test
    public void findBookByFullAuthorTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("The adventures of Sherlock Holmes", "A.C.Doyle");
        Book book3 = new Book("A Scandal in Bohemia", "A.C.Doyle");
        Book book4 = new Book("The Odyssey", "Homer");

        victim.addBook(book1);
        victim.addBook(book2);
        victim.addBook(book3);
        victim.addBook(book4);

        Optional<Book[]> optional = victim.findBooksByAuthor("A.C.Doyle");
        Book[] result = optional.orElse(new Book[]{new Book("No such book", "")});

        Book[] expected = new Book[]{new Book("The adventures of Sherlock Holmes", "A.C.Doyle"),
                                    new Book("A Scandal in Bohemia", "A.C.Doyle")};

        for (int i = 0; i < expected.length; i++){
            if (!result[i].equals(expected[i])){
                throw new AssertionError("Result and expected are not equal");
            }
        }

    }

    @Test
    public void findBookByFirstNameTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Song of Ice and Fire", "George Martin");
        Book book3 = new Book("The Odyssey", "Homer");

        victim.addBook(book1);
        victim.addBook(book2);
        victim.addBook(book3);

        Optional<Book[]> optional = victim.findBooksByAuthor("George");
        Book[] result = optional.orElse(new Book[]{new Book("No such book", "")});

        Book[] expected = new Book[]{new Book("1984", "George Orwell"),
                                    new Book("Song of Ice and Fire", "George Martin")};

        for (int i = 0; i < expected.length; i++){
            if (!result[i].equals(expected[i])){
                throw new AssertionError("Result and expected are not equal");
            }
        }
    }

    @Test
    public void findBookByFullTitleTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("The adventures of Sherlock Holmes", "A.C.Doyle");
        Book book3 = new Book("A Scandal in Bohemia", "A.C.Doyle");
        Book book4 = new Book("The Odyssey", "Homer");

        victim.addBook(book1);
        victim.addBook(book2);
        victim.addBook(book3);
        victim.addBook(book4);

        Optional<Book[]> optional = victim.findBooksByTitle("The Odyssey");
        Book[] result = optional.orElse(new Book[]{new Book("No such book", "")});

        Book[] expected = new Book[]{new Book("The Odyssey", "Homer")};

        for (int i = 0; i < expected.length; i++){
            if (!result[i].equals(expected[i])){
                throw new AssertionError("Result and expected are not equal");
            }
        }

    }

    @Test
    public void findBookByFirstPartOfTitleTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("The adventures of Sherlock Holmes", "A.C.Doyle");
        Book book3 = new Book("A Scandal in Bohemia", "A.C.Doyle");
        Book book4 = new Book("The Odyssey", "Homer");

        victim.addBook(book1);
        victim.addBook(book2);
        victim.addBook(book3);
        victim.addBook(book4);

        Optional<Book[]> optional = victim.findBooksByTitle("The");
        Book[] result = optional.orElse(new Book[]{new Book("No such book", "")});

        Book[] expected = new Book[]{new Book("The adventures of Sherlock Holmes", "A.C.Doyle"),
                new Book("The Odyssey", "Homer")};

        for (int i = 0; i < expected.length; i++){
            if (!result[i].equals(expected[i])){
                throw new AssertionError("Result and expected are not equal");
            }
        }

    }

    @Test
    public void markAsReadTest(){
        BookReaderImpl victim = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        victim.addBook(book1);
        assertTrue(victim.markAsRead(book1));
        assertTrue(BooksDatabase.allBooks[0].getRead());
    }

    @Test
    public void markAsUnreadTest(){
        BookReaderImpl victim = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        victim.addBook(book1);
        victim.markAsRead(book1);
        assertTrue(victim.markAsUnread((book1)));
        assertFalse(BooksDatabase.allBooks[0].getRead());
    }

    @Test
    public void findAllReadBooksTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("The adventures of Sherlock Holmes", "A.C.Doyle");
        Book book3 = new Book("A Scandal in Bohemia", "A.C.Doyle");
        Book book4 = new Book("The Odyssey", "Homer");

        victim.addBook(book1);
        victim.addBook(book2);
        victim.addBook(book3);
        victim.addBook(book4);

        victim.markAsRead(book1);
        victim.markAsRead(book2);
        victim.markAsRead(book3);
        victim.markAsUnread(book3);

        Optional<Book[]> optional = victim.findAllReadBooks();
        Book[] result;

        if (optional.isPresent())
             result = optional.get();
        else
            throw new AssertionError("Bruh");

        Book[] expected = new Book[]{new Book("Harry Potter", "J.K.Rowling"),
                new Book("The adventures of Sherlock Holmes", "A.C.Doyle")};

        for (int i = 0; i < expected.length; i++){
            if (!result[i].equals(expected[i])){
                throw new AssertionError("Result and expected are not equal");
            }
        }
    }

    @Test
    public void findAllUnreadBooksTest(){
        BookReaderImpl victim = new BookReaderImpl();

        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("The adventures of Sherlock Holmes", "A.C.Doyle");
        Book book3 = new Book("A Scandal in Bohemia", "A.C.Doyle");
        Book book4 = new Book("The Odyssey", "Homer");

        victim.addBook(book1);
        victim.addBook(book2);
        victim.addBook(book3);
        victim.addBook(book4);

        Optional<Book[]> optional = victim.findAllUnreadBooks();
        Book[] result;

        if (optional.isPresent())
            result = optional.get();
        else
            throw new AssertionError("Bruh");

        Book[] expected = new Book[]{new Book("Harry Potter", "J.K.Rowling"),
                new Book("The adventures of Sherlock Holmes", "A.C.Doyle"),
                new Book("A Scandal in Bohemia", "A.C.Doyle"),
                new Book("The Odyssey", "Homer")};

        for (int i = 0; i < expected.length; i++){
            if (!result[i].equals(expected[i])){
                throw new AssertionError("Result and expected are not equal");
            }
        }

    }



}
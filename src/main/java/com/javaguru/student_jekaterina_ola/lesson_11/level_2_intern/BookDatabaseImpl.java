package com.javaguru.student_jekaterina_ola.lesson_11.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CodeReview(approved = true)
class BookDatabaseImpl implements BookDatabase {
    List<Book> books = new ArrayList<>();


    public static void main (String[] args) {
        Book book = new Book ("1","2");
        Book book1 = new Book ("3", "4");
        Book book2 = new Book ("5", "6");
        Book book3 = new Book ("7", "8");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);


    }

    @Override
    public Long save(Book book) {
        int count = books.size();
        books.add(book);
        count += 1;
        Long number = Long.valueOf(count);
        return number;
    }

    @Override
    public boolean delete(Long bookId) {
        int count = bookId.intValue();
        for (int i=0; i < books.size(); i++) {
            if (i == count) {
                books.remove(count);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        int id = bookId.intValue();
        for (int i = 0; i < books.size(); i++) {
            if (i == id) {
                return Optional.of(books.get(i));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                bookAuthor.add(books.get(i));
            }
        }
        return bookAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                bookTitle.add(books.get(i));
            }
        }
        return bookTitle;
    }

    @Override
    public int countAllBooks() {
        int result = books.size();
        return result;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(author)) {
                books.remove(i);
                i--;
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                i--;
            }

        }
    }
}

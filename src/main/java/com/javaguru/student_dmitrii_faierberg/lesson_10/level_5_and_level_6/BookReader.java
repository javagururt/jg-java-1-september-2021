package com.javaguru.student_dmitrii_faierberg.lesson_10.level_5_and_level_6;

import java.util.Optional;

public interface BookReader {
    boolean addBook(Book book);
    boolean deleteBook(Book book);
    String[] showAllBooks();
    Optional<Book[]> findBooksByAuthor(String author);
    Optional<Book[]> findBooksByTitle(String title);
    boolean markAsRead(Book book);
    boolean markAsUnread(Book book);
    Optional<Book[]> findAllReadBooks();
    Optional<Book[]> findAllUnreadBooks();
}

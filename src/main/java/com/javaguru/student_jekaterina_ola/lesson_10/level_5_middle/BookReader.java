package com.javaguru.student_jekaterina_ola.lesson_10.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
public interface BookReader {
    boolean addBook (Book book);
    boolean deleteBook (Book book);
    String[] showAllBooks();
    Optional<Book[]> findBookByAuthor(String author);
    Optional<Book[]> findBookByTitle(String title);
    boolean markAsRead(Book book);
    boolean markAsUnread(Book book);
    Optional<Book[]> findAllReadBooks();
    Optional<Book[]> findAllUnreadBooks();

}

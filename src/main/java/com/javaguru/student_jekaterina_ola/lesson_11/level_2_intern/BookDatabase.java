package com.javaguru.student_jekaterina_ola.lesson_11.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
import java.util.Optional;
@CodeReview(approved = true)
public interface BookDatabase {
    Long save (Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    int countAllBooks();
    void deleteByAuthor(String author);
    void deleteByTitle(String title);

}

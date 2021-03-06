package com.javaguru.student_deniss_lohins.lesson_10.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
@CodeReview(approved = true)
public interface BookReader {

    public boolean addBook(Book book);
    public boolean removeBook(Book book);
    public String[] content();
    public List<Book> findByAuthor(String author);

}

package com.javaguru.student_jekaterina_ola.lesson_11.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Objects;
@CodeReview(approved = true)
public class Book {
    private String author;
    private String title;

    Book (String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {return this.title;}

    public String getAuthor() {return this.author;}

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);

    }

    public int hashCode() {return Objects.hash(title, author); }
}

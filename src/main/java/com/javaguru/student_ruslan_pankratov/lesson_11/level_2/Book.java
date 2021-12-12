package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Objects;

//Task_6
@CodeReview(approved = true)
public class Book{
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

  public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getId(), book.getId()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getYearOfIssue(), book.getYearOfIssue());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                '}';
    }


}

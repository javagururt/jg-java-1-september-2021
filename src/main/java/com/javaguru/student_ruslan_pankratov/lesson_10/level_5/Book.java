package com.javaguru.student_ruslan_pankratov.lesson_10.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {
    String nameBook;
    String nameAuthor;

    public Book(String nameBook, String nameAuthor) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    public Book() {
    }

    public Book(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
}

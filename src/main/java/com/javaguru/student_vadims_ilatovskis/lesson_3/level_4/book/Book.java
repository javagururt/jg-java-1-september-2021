package com.javaguru.student_vadims_ilatovskis.lesson_3.level_4.book;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {
    private String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    public String getTitle() {
        return this.title;
    }

}


package com.javaguru.student_nikita_simans.homework.lesson_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

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

package com.javaguru.student_deniss_lohins.lesson_12.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.UUID;
@CodeReview(approved = true)
class Book {
    private String author;
    private UUID uuid;

    public Book(String author, UUID uuid) {
        this.author = author;
        this.uuid = uuid;
    }
}

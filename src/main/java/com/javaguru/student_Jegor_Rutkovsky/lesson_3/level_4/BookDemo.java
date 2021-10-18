package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}

package com.javaguru.student_vadims_ilatovskis.lesson_3.level_4.book;

import com.javaguru.student_vadims_ilatovskis.lesson_3.level_4.book.Book;
import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}

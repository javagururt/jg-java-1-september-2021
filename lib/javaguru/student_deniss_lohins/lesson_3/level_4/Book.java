package com.javaguru.student_deniss_lohins.lesson_3.level_4;

/*Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Book.*/

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    private String bookTitle;

    Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getTitle() {
        return this.bookTitle;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

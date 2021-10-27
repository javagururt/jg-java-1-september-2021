package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson3.task_14;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

/*Найти ошибку в коде.
 Исправить и запустить программу.
 Менять можно только класс Book.*/
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

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

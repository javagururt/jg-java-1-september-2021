package com.javaguru.student_ruslan_pankratov.lesson_3.level_4;

//Task_14
class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
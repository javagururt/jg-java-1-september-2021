package com.javaguru.student_ruslan_pankratov.lesson_10.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookReader {

    boolean addingBooksToTheElectronicLibrary(Book book);

    boolean deleteBook(Book book);

    String listOfAllBooks();

    String authorSearch(String nameAuthor);
    String searchBookName(String name);

    boolean readBookMethod(String name, String nameAuthor);
    boolean notReadBookMethod(String name, String nameAuthor);

    String readBookList();
    String notReadBookList();
}

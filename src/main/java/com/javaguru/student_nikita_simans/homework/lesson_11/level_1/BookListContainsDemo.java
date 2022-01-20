package com.javaguru.student_nikita_simans.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Mark", "Why Im here?");
        Book book2 = new Book("John", "Java Coding");
        books.add(book1);
        books.add(book2);
        Book referenceBookInTheList = new Book("Mark", "Why Im here?");
        boolean bookInTheList = books.contains(referenceBookInTheList);
        System.out.println("Reference Book is in the List: " + bookInTheList);
        Book referenceBookNotInTheList = new Book("Sara", "Something about me");
        boolean bookNotInTheList = books.contains(referenceBookNotInTheList);
        System.out.println("Reference Book is in the List: " + bookNotInTheList);
    }
}
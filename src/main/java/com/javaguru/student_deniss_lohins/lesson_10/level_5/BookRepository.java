package com.javaguru.student_deniss_lohins.lesson_10.level_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BookRepository {

    private Map<String, Book> repository;
    private String[][] content;

    public BookRepository() {
        repository = new HashMap<>();
    }

    boolean save(Book book) {
        if (book.getBookName() != null && book.getAuthor() != null) {
            if (book.getAuthor() != "" && book.getBookName() != "") {
                if (repository.isEmpty()) {
                    repository.put(book.getBookName(), book);
                    return true;
                } else {
                    if (repository.containsValue(book)) {
                        return false;
                    } else {
                        repository.put(book.getBookName(), book);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean remove(Book book) {
        if (repository.containsValue(book)) {
            repository.remove(book.getBookName());
            return true;
        }
        return false;
    }

    String[] content() {

        String[] asArray = new String[repository.size()];
        int index = 0;

        for (String entry : repository.keySet()) {
            asArray[index++] = String.valueOf(repository.get(entry));
        }
        return asArray;
    }

    List<Book> fingByAuthor(String author) {
        List<Book> booksToReturn = new ArrayList<>();
        for (String entry : repository.keySet()) {
            if (String.valueOf(repository.get(entry)) == author) {
                booksToReturn.add(repository.get(entry));
            }
        }
        return booksToReturn;
    }
}

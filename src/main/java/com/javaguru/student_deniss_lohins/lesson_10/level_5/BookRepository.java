package com.javaguru.student_deniss_lohins.lesson_10.level_5;

import java.util.HashMap;
import java.util.Map;

class BookRepository {

    private Map<String, Book> repository;

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

   /* String[] content() {
        String[] bookNames =  repository.keySet().toArray();
        String[] authors =  repository.values().toArray();
        String[] result = new String[bookNames.length];
        for (int i = 0; i < bookNames.length; i++) {
            result[i] = bookNames[i] + " [" + authors[i] + "]";
        }
        return result;
        }
    }*/
}

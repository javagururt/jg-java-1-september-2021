package com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    private Map<Long, Book> repository;
    Long counter;

    public BookDatabaseImpl() {
        counter = Long.valueOf(0);
        repository = new HashMap<>();
    }

    public Long save(Book book) {
        counter++;
        book.setId(counter);
        repository.put(counter, book);
        return counter;
    }

    public boolean delete(Long bookId) {
        if (repository.containsKey(bookId)) {
            repository.remove(bookId);
            return true;
        }
        return false;
    }

    public boolean delete(Book book) {
        if (repository.containsValue(book)) {
            repository.remove(book);
            return true;
        }
        return false;
    }

    public Optional<Book> findById(Long bookId) {
        Optional<Book> result = Optional.ofNullable(repository.get(bookId));
        return result;
    }


    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        Iterator<Book> iterator = repository.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }


    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        Iterator<Book> iterator = repository.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }


    public int countAllBooks() {
        return repository.size();
    }


    public void deleteByAuthor(String author) {
        Iterator<Book> iterator = repository.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equalsIgnoreCase(author)) {
                iterator.remove();
            }
        }
    }


    public void deleteByTitle(String title) {
        Iterator<Book> iterator = repository.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
            }
        }
    }

    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> result = new ArrayList<>();
        Iterator<Book> iterator = repository.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }


    public Set<String> findUniqueAuthors() {
        return null;
    }

}

package com.javaguru.student_nikita_simans.homework.lesson_11.level_2;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    private Map<Long, Book> repository;
    Long counter;

    public BookDatabaseImpl() {
        counter = Long.valueOf(0);
        repository = new HashMap<>();
    }

    @Override
    public Long save(Book book) {
        counter++;
        book.setId(counter);
        repository.put(counter, book);
        return counter;
    }

    @Override
    public boolean delete(Long bookId) {
        if (repository.containsKey(bookId)) {
            repository.remove(bookId);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (repository.containsValue(book)) {
            repository.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> result = Optional.ofNullable(repository.get(bookId));
        return result;
    }

    @Override
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

    @Override
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

    @Override
    public int countAllBooks() {
        return repository.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        Iterator<Book> iterator = repository.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equalsIgnoreCase(author)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Iterator<Book> iterator = repository.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
            }
        }
    }


}
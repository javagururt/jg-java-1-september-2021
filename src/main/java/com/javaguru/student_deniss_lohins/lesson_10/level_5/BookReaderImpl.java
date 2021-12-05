package com.javaguru.student_deniss_lohins.lesson_10.level_5;

class BookReaderImpl implements BookReader {
    BookRepository repository;

    public BookReaderImpl() {
        repository = new BookRepository();
    }

    @Override
    public boolean addBook(Book book) {
        if (repository.save(book)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        if (repository.remove(book)){
            return true;
        }
        return false;
    }

    @Override
    public String[] content() {
        return new String[0];
    }

}

package com.javaguru.student_dmitrii_faierberg.lesson_10.level_5_and_level_6;

import java.util.Arrays;
import java.util.Optional;

class BookReaderImpl implements BookReader {
    @Override
    public boolean addBook(Book newBook){
        if (!checkTitleAndAuthor(newBook))
            return false;

        Optional<Book[]> optional = Optional.ofNullable(BooksDatabase.allBooks);
        if (optional.isPresent()) {
            if (isBookInAllBooks(BooksDatabase.allBooks, newBook)) {
                return false;
            }
        }

        Book[] newArray = createBiggerBookArray(BooksDatabase.allBooks);
        newArray[newArray.length - 1] = newBook;
        BooksDatabase.allBooks = newArray;
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        Optional<Book[]> optional = Optional.ofNullable(BooksDatabase.allBooks);
        if (optional.isEmpty())
            return false;

        if (!isBookInAllBooks(BooksDatabase.allBooks, book))
            return false;

        BooksDatabase.allBooks = smallerArrayWithDeletedBookFromAllBooks(BooksDatabase.allBooks, book);
        return true;
    }

    @Override
    public String[] showAllBooks(){
        Book book;
        int length = BooksDatabase.allBooks.length;
        String[] formattedAllBooks = new String[length];

        for (int i = 0; i < length; i++){
            book = BooksDatabase.allBooks[i];
            formattedAllBooks[i] = book.getTitle() + " [" + book.getAuthor() + "]";
        }

        return formattedAllBooks;
    }

    @Override
    public Optional<Book[]> findBooksByAuthor(String author){
        return findBooksByAuthorInAllBooks(BooksDatabase.allBooks, author);
    }

    @Override
    public Optional<Book[]> findBooksByTitle(String title){
        return findBooksByTitleInAllBooks(BooksDatabase.allBooks, title);
    }

    @Override
    public boolean markAsRead(Book book){
        Book[] books = BooksDatabase.allBooks;
        for (Book value : books) {
            if (value.equals(book)) {
                value.setRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markAsUnread(Book book){
        Book[] books = BooksDatabase.allBooks;
        for (Book value : books) {
            if (value.equals(book)) {
                value.setRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book[]> findAllReadBooks(){
        Book[] books = BooksDatabase.allBooks;
        Book[] result = null;
        for (Book value : books){
            if (value.getRead()){
                result = createBiggerBookArray(result);
                result[result.length - 1] = value;
            }
        }
        return Optional.ofNullable(result);
    }

    @Override
    public Optional<Book[]> findAllUnreadBooks(){
        Book[] books = BooksDatabase.allBooks;
        Book[] result = null;
        for (Book value : books){
            if (!value.getRead()){
                result = createBiggerBookArray(result);
                result[result.length - 1] = value;
            }
        }
        return Optional.ofNullable(result);
    }

    private Optional<Book[]> findBooksByAuthorInAllBooks(Book[] allBooks, String author){
        Book[] books = null;
        for (Book item : allBooks) {
            if (item.equalsByAuthor(author)) {
                Book[] newBooks = createBiggerBookArray(books);
                newBooks[newBooks.length - 1] = item;
                books = newBooks;
            }
        }
        return Optional.ofNullable(books);
    }

    private Optional<Book[]> findBooksByTitleInAllBooks(Book[] allBooks, String title){
        Book[] books = null;
        for (Book item : allBooks) {
            if (item.equalsByTitle(title)) {
                Book[] newBooks = createBiggerBookArray(books);
                newBooks[newBooks.length - 1] = item;
                books = newBooks;
            }
        }
        return Optional.ofNullable(books);
    }


    private boolean isBookInAllBooks(Book[] allBooks, Book book){
        for (Book item : allBooks) {
            if (item.equals(book)) {
                return true;
            }
        }

        return false;
    }


    private Book[] createBiggerBookArray(Book[] old){
        Optional<Book[]> optional = Optional.ofNullable(old);
        if (optional.isPresent()){
            return Arrays.copyOf(old, old.length + 1);
        } else {
            return new Book[1];
        }

    }

    private Book[] smallerArrayWithDeletedBookFromAllBooks(Book[] old, Book book){
        Book[] newArray = new Book[old.length - 1];
        int k = 0;
        for(int i = 0; i < old.length; i++) {
            if (BooksDatabase.allBooks[i].equals(book))
                continue;
            newArray[k] = old[i];
            k++;
        }
        return newArray;
    }

    private boolean checkTitleAndAuthor(Book book){
        return !book.getTitle().equals("") && !book.getAuthor().equals("");
    }
}

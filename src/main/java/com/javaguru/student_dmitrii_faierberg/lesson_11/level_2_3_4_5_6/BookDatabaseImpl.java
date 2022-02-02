package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.*;
@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase {
    private static long sequenceId = 1;
    List<Book> database = new ArrayList<>();

    public static long getSequenceId() {
        return sequenceId;
    }

    public static void setSequenceId(long sequenceId) {
        BookDatabaseImpl.sequenceId = sequenceId;
    }

    @Override
    public Long save(Book book) {
        book.setId(sequenceId);
        sequenceId++;
        database.add(book);
        return sequenceId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < database.size(); i++){
            if (database.get(i).getId().equals(bookId)){
                database.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < database.size(); i++){
            if (database.get(i).equals(book)){
                database.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (int i = 0; i < database.size(); i++){
            if (database.get(i).getId().equals(bookId)){
                return Optional.of(database.get(i));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : database) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : database) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        int counter = 0;
        for (Book book : database) {
            counter++;
        }
        return counter;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getAuthor().equals(author)) {
                database.remove(database.get(i));
                i--;
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getTitle().equals(title)) {
                database.remove(database.get(i));
                i--;
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria){
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < database.size(); i++){
            if (searchCriteria.match(database.get(i))){
                result.add(database.get(i));
            }
        }
        return result;
    }

    @Override
    public Set<String> findUniqueAuthors(){
        Set<String> result = new HashSet<>();
        for (int i = 0; i < database.size(); i++){
            result.add(database.get(i).getAuthor());
        }
        return result;
    }

    @Override
    public Set<String> findUniqueTitles(){
        Set<String> result = new HashSet<>();
        for (int i = 0; i < database.size(); i++){
            result.add(database.get(i).getTitle());
        }
        return result;
    }

    @Override
    public Set<Book> findUniqueBooks(){
        Set<Book> result = new HashSet<>();
        for (int i = 0; i < database.size(); i++){
            result.add(database.get(i));
        }
        return result;
    }

    @Override
    public boolean contains(Book book){
        return database.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap(){
        Map<String, List<Book>> result = new HashMap<>();
        List<String> authors = findUniqueAuthors().stream().toList();
        for (String author : authors) {
            result.put(author, findByAuthor(author));
        }
        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount(){
        Map<String, Integer> result = new HashMap<>();
        Set<Book> uniqueBooks = new HashSet<>();
        List<String> authors = findUniqueAuthors().stream().toList();

        for (String author : authors) {
            uniqueBooks.clear();
            uniqueBooks.addAll(findByAuthor(author));
            int amount = uniqueBooks.size();
            result.put(author, amount);
        }
        return result;
    }


}

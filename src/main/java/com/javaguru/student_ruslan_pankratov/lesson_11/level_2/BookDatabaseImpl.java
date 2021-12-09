package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import java.util.*;

//Task_6
public class BookDatabaseImpl implements BookDatabase {
    List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Book book = new Book("2", "1");
        Book book1 = new Book("4", "Red");
        Book book2 = new Book("2", "Red");
        Book book3 = new Book("2", "Blue");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);


    }


    @Override
    public Long save(Book book) {
        int count = books.size();
        books.add(book);
        count += 1;
        Long number = Long.valueOf(count);
        return number;
    }

    @Override
    public boolean delete(Long bookId) {
        int count = bookId.intValue();
        for (int i = 0; i < books.size(); i++) {
            if (i == count) {
                books.remove(count);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }


    @Override
    public Optional<Book> findById(Long bookId) {
        int id = bookId.intValue();
        for (int i = 0; i < books.size(); i++) {
            if (i == id) {
                return Optional.of(books.get(i));
            }
        }
        return Optional.empty();
    }


    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                bookAuthor.add(books.get(i));
            }
        }
        return bookAuthor;
    }


    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                bookTitle.add(books.get(i));
            }
        }
        return bookTitle;
    }

    @Override
    public int countAllBooks() {
        int result = books.size();
        return result;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {//
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                books.remove(i);
                i--;
            }
        }
    }


    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                i--;
            }
        }
    }


    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (searchCriteria.match(books.get(i))) {
                bookList.add(books.get(i));
            }
        }

        return bookList;
    }


    @Override
    public Map<Integer, List<Book>> find(SearchCriteria searchCriteria, Paging paging) {
        List<Book> bookList = new ArrayList<>();
        add(searchCriteria, bookList);
        Map<Integer, List<Book>> result = new HashMap<>();
        addInMap(bookList, result, paging);
        return result;
    }

    @Override
    public Map<Integer, List<Book>> find(SearchCriteria searchCriteria, Paging paging, boolean sort) {
        List<Book> bookList = new ArrayList<>();
        add(searchCriteria, bookList);
        if (sort) {
            sort(bookList);
        }
        Map<Integer, List<Book>> result = new HashMap<>();
        addInMap(bookList, result, paging);
        return result;

    }

    private void sort(List<Book> bookList) {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int result = o1.getAuthor().compareTo(o2.getAuthor());
                if (result == 0) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
                return result;
            }
        });
    }

    private void add(SearchCriteria searchCriteria, List<Book> bookList) {
        for (int i = 0; i < books.size(); i++) {
            if (searchCriteria.match(books.get(i))) {
                bookList.add(books.get(i));
            }
        }
    }

    private void addInMap(List<Book> bookList, Map<Integer, List<Book>> result, Paging paging) {
        List<Book> bookList2 = new ArrayList<>();
        int count = 0;
        int key = 0;
        for (int i = 0; i < bookList.size(); i++) {

            bookList2.add(bookList.get(i));
            count++;
            if (count == paging.getMaximumAmount() || i == bookList.size() - 1) {
                List<Book> bookList3 = new ArrayList<>(bookList2);
                result.put(key, bookList3);
                key++;
                bookList2.clear();
                count = 0;
            }
        }
    }


    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < books.size(); i++) {
            result.add(books.get(i).getAuthor());
        }
        return result;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < books.size(); i++) {
            result.add(books.get(i).getTitle());
        }
        return result;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> book = new HashSet<>();
        for (int i = 0; i < books.size(); i++) {
            book.add(books.get(i));
        }
        return book;
    }

    @Override
    public boolean contains(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                return true;
            }
        }
        return false;

    }


    @Override
    public Set<String> find(String text) {
        String[] arr = text.split(" ");
        Set<String> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }

        return result;
    }


    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> result = new HashMap<>();
        for (int i = 0; i < books.size(); i++) {
            result.put(books.get(i).getAuthor(), findByAuthor(books.get(i).getAuthor()));
        }
        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < books.size(); i++) {
            result.put(books.get(i).getAuthor(), findByAuthor(books.get(i).getAuthor()).size());
        }
        return result;
    }
}


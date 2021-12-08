package com.javaguru.student_ruslan_pankratov.lesson_10.level_5;

//Task_13-18

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class BookReaderImpl implements BookReader {
    List<Book> library = new ArrayList<>();

    List<Book> readBook = new ArrayList<>();
    List<Book> notReadBook = new ArrayList<>();


    void createLibrary() {
        Book book = new Book("War", "Miller");
        Book book2 = new Book("War", "Jhon");
        Book book3 = new Book("Castle", "Miller");
        Book book4 = new Book("See", "Miller");
        Book book5 = new Book("Phone", "Mill Gir");
        Book book6 = new Book("Car Read", "Miller");
        library.add(book);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);
    }

    @Override
    public boolean addingBooksToTheElectronicLibrary(Book book) {
        if (book.nameBook != null && book.nameAuthor != null) {
            for (int i = 0; i < library.size(); i++) {
                if (!library.get(i).nameAuthor.equalsIgnoreCase(book.nameAuthor) &&
                        !library.get(i).nameBook.equalsIgnoreCase(book.nameBook)) {
                    library.add(book);
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (book != null && book.nameBook != null && book.nameAuthor != null) {
            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).nameAuthor.equalsIgnoreCase(book.nameAuthor)
                        && library.get(i).nameBook.equalsIgnoreCase(book.nameBook)) {
                    library.remove(book);
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public String listOfAllBooks() {
        String ar = "";
        for (int i = 0; i < library.size(); i++) {
            ar = ar + library.get(i).nameBook + "[" + library.get(i).nameAuthor + "] \n";
        }
        return ar;
    }


    @Override
    public String authorSearch(String nameAuthor) {
        String result = "";

        for (int i = 0; i < library.size(); i++) {
            String[] textArray = library.get(i).nameAuthor.split(" ");
            String[] textArray2 = nameAuthor.split(" ");
            for (int j = 0; j < textArray.length; j++) {
                for (int k = 0; k < textArray2.length; k++) {
                    if (textArray[j].equalsIgnoreCase(textArray2[k])) {
                        result = result + library.get(i).nameBook + " ";
                    }
                }
            }
        }
        return result;


    }

    @Override
    public String searchBookName(String name) {

        String result = "";

        for (int i = 0; i < library.size(); i++) {
            String[] textArray = library.get(i).nameBook.split(" ");
            String[] textArray2 = name.split(" ");
            for (int j = 0; j < textArray.length; j++) {
                for (int k = 0; k < textArray2.length; k++) {
                    if (textArray[j].equalsIgnoreCase(textArray2[k])) {
                        result = result + "Name Book = [" + library.get(i).nameBook + "] Name Author = ["
                                + library.get(i).nameAuthor + "], ";
                    }
                }
            }
        }
        return result;
    }


    @Override
    public boolean readBookMethod(String name, String nameAuthor) {
        for (int i = 0; i < library.size() ; i++) {
            if(name == library.get(i).nameBook && nameAuthor == library.get(i).nameAuthor){
                readBook.add(library.get(i));
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean notReadBookMethod(String name, String nameAuthor) {
        for (int i = 0; i < library.size() ; i++) {
            if(name == library.get(i).nameBook && nameAuthor == library.get(i).nameAuthor){
                notReadBook.add(library.get(i));
                return true;
            }
        }

        return false;
    }

    @Override
    public String readBookList() {
        String arr = "";
        for (int i = 0; i < readBook.size(); i++) {
            arr = arr + "Название книги = " + readBook.get(i).nameBook + "[" + readBook.get(i).nameAuthor +"]";
        }
        System.out.println(arr);
        return arr;
    }

    @Override
    public String notReadBookList() {
        String arr = "";
        for (int i = 0; i < notReadBook.size(); i++) {
        arr = arr + "Название книги = " + notReadBook.get(i).nameBook + "[" + notReadBook.get(i).nameAuthor +"]";
        }
        System.out.println(arr);
        return arr;
    }
}

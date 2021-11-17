package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class ServiceLibrary {
    static boolean returned = true;

    public static void main(String[] args) throws InterruptedException {
        Customer ivan = new Customer("Ivan");

        ServiceLibrary serviceLibrary = new ServiceLibrary();
        serviceLibrary.out(serviceLibrary.libraries);

        System.out.println("---------");
        System.out.println("Добавляем новую книгу в библиотеку");
        Library bookThree = new Library("proverka", "proverka");
        serviceLibrary.librariesAdd(bookThree);
        serviceLibrary.out(serviceLibrary.libraries);

        System.out.println("---------");
        System.out.println("Забераем одну книгу из Библиотеки");
        serviceLibrary.takeABookFromTheLibrary("Free", ivan);
        serviceLibrary.out(serviceLibrary.libraries);

        System.out.println("---------");
        System.out.println("книги должника");
        serviceLibrary.out(serviceLibrary.needToReturnBooks);
        serviceLibrary.returnBookLibrary("Free");

        System.out.println("---------");
        System.out.println("В библиотеку вернули книгу");
        serviceLibrary.out(serviceLibrary.needToReturnBooks);
        serviceLibrary.out(serviceLibrary.libraries);

        System.out.println("---------");
        System.out.println("Книга которую я искал");
        serviceLibrary.bookSearch("Been");

        System.out.println("---------");
        System.out.println("зарезервированая книга");
        serviceLibrary.bookReservation("Been");
        serviceLibrary.out(serviceLibrary.bookReservation);

        System.out.println("---------");
        System.out.println("Взял домой и должен вернуть");
        serviceLibrary.takeABookFromTheLibrary("Free", ivan);
        System.out.println("Книга которую надо вернуть");
        serviceLibrary.out(serviceLibrary.needToReturnBooks);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.returnBookLibrary("Free");
        serviceLibrary.periodOneDay(ivan);

        System.out.println("--------");
        System.out.println("Сейчас он не вернёт книгу");
        serviceLibrary.takeABookFromTheLibrary("Free", ivan);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.periodOneDay(ivan);
        serviceLibrary.periodOneDay(ivan);


    }

    Library bookOne = new Library("Mer", "Ner");
    Library bookTwo = new Library("Free", "Miller");
    Library bookThree = new Library("Been", "Jhon");


    Library[] libraries = {bookOne, bookTwo, bookThree};

    static Library[] needToReturnBooks = new Library[0];

    Library[] bookReservation = new Library[0];


    void librariesAdd(Library library) {//добавляем книги тут в библиотеку
        Library[] librariesAddBook = new Library[libraries.length + 1];
        for (int i = 0; i < libraries.length + 1; i++) {
            if (i != libraries.length) {
                librariesAddBook[i] = libraries[i];
            } else {
                librariesAddBook[i] = library;
            }
        }
        libraries = new Library[librariesAddBook.length];
        for (int i = 0; i < librariesAddBook.length; i++) {
            libraries[i] = librariesAddBook[i];
        }

    }


    Library takeABookFromTheLibrary(String name, Customer customer) {//забераем книгу из библиотеки

        Library bookTakenAway = null;

        for (int i = 0; i < libraries.length; i++) {
            if (libraries[i].nameBook.equalsIgnoreCase(name)) {
                bookTakenAway = libraries[i];

            }
        }
        customer.setBookPeriod(5);//период от начала как взяли книгу
        changingTheLibrary(name);
        needToReturnBooksList(bookTakenAway);
        returned = false;
        return bookTakenAway;

    }


    void changingTheLibrary(String name) {//убераем из списка бибилотеки книгу
        Library[] changing = new Library[libraries.length - 1];
        int count = 0;
        for (int i = 0; i < libraries.length; i++) {
            if (!libraries[i].nameBook.equalsIgnoreCase(name)) {
                changing[count] = libraries[i];
                count++;
            }
        }
        libraries = new Library[changing.length];
        for (int i = 0; i < changing.length; i++) {
            libraries[i] = changing[i];
        }
    }

    void needToReturnBooksList(Library library) {
        if (library != null) {
            Library[] needToReturnBooksTwo = new Library[needToReturnBooks.length + 1];
            for (int i = needToReturnBooksTwo.length - 1; i < needToReturnBooksTwo.length; i++) {
                needToReturnBooksTwo[i] = library;
            }
            needToReturnBooks = new Library[needToReturnBooksTwo.length];
            for (int i = 0; i < needToReturnBooksTwo.length; i++) {
                needToReturnBooks[i] = needToReturnBooksTwo[i];
            }
        }
    }

    void returnBookLibrary(String nameBook) {//возвращаем книги
        returned = true;
        Library[] result1 = new Library[libraries.length + 1];
        for (int i = 0; i < libraries.length; i++) {
            result1[i] = libraries[i];

        }

        for (int i = 0; i < needToReturnBooks.length; i++) {
            if (needToReturnBooks[i].nameBook.equalsIgnoreCase("Free")) {
                result1[result1.length - 1] = needToReturnBooks[i];
            }
        }

        libraries = result1;


        Library[] result = new Library[needToReturnBooks.length - 1];
        int count = 0;
        for (int j = 0; j < needToReturnBooks.length; j++) {
            if (!needToReturnBooks[j].nameBook.equalsIgnoreCase(nameBook)) {
                result[count] = needToReturnBooks[j];
                count++;
            }
        }
        needToReturnBooks = result;
        System.out.println("Книгу вернули");
    }

    void bookSearch(String name) {
        for (int i = 0; i < libraries.length; i++) {
            if (libraries[i].nameBook.equalsIgnoreCase(name)) {
                System.out.println(libraries[i].toString());
            }
        }

    }

    void bookReservation(String name) {
        Library bookTakenAway = null;

        for (int i = 0; i < libraries.length; i++) {
            if (libraries[i].nameBook.equalsIgnoreCase(name)) {
                bookTakenAway = libraries[i];

            }
        }
        changingTheLibrary(name);
        reservesion(bookTakenAway);


    }


    void reservesion(Library library) {
        if (library != null) {
            Library[] reservesion = new Library[bookReservation.length + 1];
            for (int i = reservesion.length - 1; i < reservesion.length; i++) {
                reservesion[i] = library;
            }
            bookReservation = new Library[reservesion.length];
            for (int i = 0; i < reservesion.length; i++) {
                bookReservation[i] = reservesion[i];
            }
        }
    }

    void periodOneDay(Customer customer) {

        if (returned) {
            customer.setBookPeriod(100000);
        } else {
            customer.setBookPeriod(customer.getBookPeriod() - 1);
            warning(customer);
        }
    }

    void warning(Customer customer) {

        if (customer.getBookPeriod() == 1) {
            System.out.println("Верните книгу завтра, или будет выписан штраф");
        } else if (customer.getBookPeriod() == 0) {
            customer.setFine(20);
            System.out.println("Ваш штраф равен = " + customer.getFine());
        } else {
            System.out.println("Осталось дней до сдачи книги " + customer.getBookPeriod());
        }


    }

    void out(Library[] libraries) {
        for (int i = 0; i < libraries.length; i++) {
            if (libraries[i] != null) {
                System.out.println(libraries[i].nameBook);
            }

        }
    }

    @Override
    public String toString() {
        return "ServiceLibrary{" +
                "bookOne=" + bookOne +
                ", bookTwo=" + bookTwo +
                ", bookThree=" + bookThree +
                ", libraries=" + Arrays.toString(libraries) +
                '}';
    }


}

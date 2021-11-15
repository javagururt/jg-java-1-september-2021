package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;

class Customer {
    private String name;
    private int fine;
    private int bookPeriod;

    public Customer(String name) {
        this.name = name;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getBookPeriod() {
        return bookPeriod;
    }

    public void setBookPeriod(int bookPeriod) {
        this.bookPeriod = bookPeriod;
    }
}

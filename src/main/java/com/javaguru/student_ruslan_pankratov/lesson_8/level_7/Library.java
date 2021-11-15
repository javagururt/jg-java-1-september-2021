package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;

import java.util.Objects;

class Library {

    String nameBook;
    String nameAuthor;

    public Library(String nameBook, String nameAuthor) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Library{" +
                "nameBook='" + nameBook + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Objects.equals(nameBook, library.nameBook) && Objects.equals(nameAuthor, library.nameAuthor);
    }


}

package com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4;

public class AuthorSearchCriteria implements SearchCriteria {

    String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if (book.getAuthor().equalsIgnoreCase(authorToSearch)) {
            return true;
        }
        return false;
    }

}

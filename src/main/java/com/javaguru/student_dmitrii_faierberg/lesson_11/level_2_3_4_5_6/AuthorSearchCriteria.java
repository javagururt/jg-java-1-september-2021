package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }

}


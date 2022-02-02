package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria{

    String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        if(book.getAuthor().equalsIgnoreCase(authorToSearch)){
            return true;
        }
        return false;
    }
}

package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Task_16
@CodeReview(approved = true)
public class AuthorSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public AuthorSearchCriteria(Paging paging, String authorToSearch) {
        super(paging);
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if (book.getAuthor().equalsIgnoreCase(this.authorToSearch)) {
            return true;
        }
        return false;
    }

}

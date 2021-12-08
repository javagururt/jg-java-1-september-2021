package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Task_17
@CodeReview(approved = true)
public class TitleSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public TitleSearchCriteria(Paging paging, String titleToSearch) {
        super(paging);
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getTitle().equalsIgnoreCase(titleToSearch)) {
            return true;
        }
        return false;
    }

}

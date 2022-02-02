package com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (book.getTitle().equalsIgnoreCase(titleToSearch)) {
            return true;
        }
        return false;
    }
}

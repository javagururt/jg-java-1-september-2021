package com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class YearOfIssueSearchCriteria implements SearchCriteria {
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if(book.getYearOfIssue().equalsIgnoreCase(yearOfIssueToSearch)){
            return true;
        }
        return false;
    }
}

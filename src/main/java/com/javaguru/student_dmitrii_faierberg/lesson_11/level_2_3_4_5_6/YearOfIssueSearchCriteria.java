package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return this.yearOfIssueToSearch.equals(book.getYearOfIssue());
    }

}
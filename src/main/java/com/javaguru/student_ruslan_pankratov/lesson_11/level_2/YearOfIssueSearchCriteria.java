package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import java.util.Objects;

//Task_18@CodeReview(approved = true)
public class YearOfIssueSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }


    public YearOfIssueSearchCriteria(Paging paging, String yearOfIssueToSearch) {
        super(paging);
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (book.getYearOfIssue().equalsIgnoreCase(this.yearOfIssueToSearch)) {
            return true;
        }
        return false;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YearOfIssueSearchCriteria)) return false;
        YearOfIssueSearchCriteria that = (YearOfIssueSearchCriteria) o;
        return Objects.equals(yearOfIssueToSearch, that.yearOfIssueToSearch);
    }

}
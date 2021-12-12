package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

class YearOfIssueSearchCriteria implements SearchCriteria{

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        if(book.getYearOfIssue().equalsIgnoreCase(yearOfIssueToSearch)){
            return true;
        }
        return false;
    }
}

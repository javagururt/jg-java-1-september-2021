package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if(book.getTitle().equalsIgnoreCase(titleToSearch)){
            return true;
        }
        return false;
    }
}

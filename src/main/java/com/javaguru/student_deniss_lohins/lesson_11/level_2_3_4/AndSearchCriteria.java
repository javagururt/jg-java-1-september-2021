package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

class AndSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        if(leftCondition.match(book) && rightCondition.match(book)){
            return true;
        }
        return false;
    }

}

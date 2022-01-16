package com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4;

public class AndSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if(leftCondition.match(book) && rightCondition.match(book)){
            return true;
        }
        return false;
    }
}

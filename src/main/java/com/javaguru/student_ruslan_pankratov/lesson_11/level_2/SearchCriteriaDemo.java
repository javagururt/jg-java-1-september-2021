package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteriaDemo searchCriteriaDemo = new SearchCriteriaDemo();
        Book book = new Book("Kuper", "Zveroboi");
        book.setYearOfIssue("1890");

        Book book1 = new Book("Red", "Mount");
        book1.setYearOfIssue("1890");

        Book book3 = new Book("Kuper", "Red");
        book3.setYearOfIssue("1390");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria year = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        boolean result1 = searchCriteria.match(book);
        System.out.println(result1);


        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, year);
        boolean result2 = searchCriteria2.match(book);
        System.out.println(result2);


        boolean result3 = searchCriteriaDemo.orThreeMethod(authorSearchCriteria, titleSearchCriteria, year, book3);
        System.out.println(result3);


    }

    boolean orThreeMethod(SearchCriteria one, SearchCriteria two, SearchCriteria three, Book book) {
        if (one.match(book) || two.match(book) || three.match(book)) {
            return true;
        } else {
            return false;
        }
    }
}

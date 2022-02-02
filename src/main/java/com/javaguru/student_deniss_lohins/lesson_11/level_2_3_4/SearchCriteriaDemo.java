package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SearchCriteriaDemo {

    public static void main(String[] args) {
        SearchCriteria author = new AuthorSearchCriteria("Kuper");
        SearchCriteria authorAndYear = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1890"));
        SearchCriteria authorOrYearOrTitle = new OrSearchCriteria(new OrSearchCriteria(new AuthorSearchCriteria("kuper"),
                new YearOfIssueSearchCriteria("1890")), new TitleSearchCriteria("Zveroboi"));

        Book book1 = new Book("kuper", "zveroboi");
        book1.setYearOfIssue("1890");
        Book book2 = new Book("Ne kuper", "zveroboi");
        book2.setYearOfIssue("1890");
        Book book3 = new Book("ne kuper", "ne zveroboi");
        book3.setYearOfIssue("1890");
        Book book4 = new Book("ne kuper", "ne zveroboi");
        book4.setYearOfIssue("ne 1890");
        System.out.println(author.match(book1));
        System.out.println(authorAndYear.match(book1));
        System.out.println(authorOrYearOrTitle.match(book1));
        System.out.println(authorOrYearOrTitle.match(book4));
    }
}

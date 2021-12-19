package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");


        Book book1 = new Book("Kuper", "Zveroboi");
        Book book2 = new Book("A1", "B1");
        book1.setYearOfIssue("1890");
        book2.setYearOfIssue("1810");

        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria.match(book1));

        searchCriteria = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);
        System.out.println(searchCriteria.match(book1));

        searchCriteria = new OrSearchCriteria(new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria),
                yearSearchCriteria);
        System.out.println(searchCriteria.match(book1));
        System.out.println(searchCriteria.match(book2));
        book2.setYearOfIssue("1890");
        System.out.println(searchCriteria.match(book2));


    }

}

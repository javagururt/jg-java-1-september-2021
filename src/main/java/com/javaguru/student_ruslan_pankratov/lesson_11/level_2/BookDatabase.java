package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

//Task_6
@CodeReview(approved = true)
public interface BookDatabase {
    Long save(Book book);//

    boolean delete(Long bookId);//

    boolean delete(Book book);//

    Optional<Book> findById(Long bookId);//

    List<Book> findByAuthor(String author);//

    List<Book> findByTitle(String title);//

    int countAllBooks();//

    void deleteByAuthor(String author);//

    void deleteByTitle(String title);//

    List<Book> find(SearchCriteria searchCriteria);//

    Set<String> findUniqueAuthors();//

    Set<String> findUniqueTitles();//

    Set<Book> findUniqueBooks();//

    boolean contains(Book book);//

    Set<String> find(String text);//

    Map<String, List<Book>> getAuthorToBooksMap();//

    Map<String, Integer> getEachAuthorBookCount();

   Map<Integer, List<Book>> find(SearchCriteria searchCriteria,Paging paging);

   Map<Integer, List<Book>> find(SearchCriteria searchCriteria,Paging paging,boolean sort);
}

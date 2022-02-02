package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.Book;
import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
class FindByTitleUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Find books by title";

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a title of the book:");
        String title = scanner.nextLine();

        List<Book> books = bookDatabase.findByTitle(title);
        int length = books.size();
        if (books != null){
            System.out.println("Books were found: " + length);
            for (int i = 0; i < length; i++){
                System.out.println(books.get(i));
            }
        } else {
            System.out.println("There are no books with this title.");
        }

    }

    public String getActionName() {
        return ACTION_NAME;
    }
}

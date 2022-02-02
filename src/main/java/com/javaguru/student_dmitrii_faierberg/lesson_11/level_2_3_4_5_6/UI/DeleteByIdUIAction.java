package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class DeleteByIdUIAction implements UIAction{
    private BookDatabase bookDatabase;
    private static final String ACTION_NAME = "Delete book by id";

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an id of the book to delete it:");
        long id = scanner.nextLong();

        boolean state = bookDatabase.delete(id);
        if (state){
            System.out.println("The book was deleted." );
        } else {
            System.out.println("There is no such book.");
        }
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}

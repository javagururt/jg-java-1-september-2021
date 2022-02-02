package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.UI;

import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabase;
import com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6.BookDatabaseImpl;
import com.javaguru.teacher.codereview.CodeReview;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@CodeReview(approved = true)
class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueBooksUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\tMenu: ");
            for (int i = 0; i <= menuNumberToActionMap.size(); i++){
                if (i == 0)
                    System.out.println("0. Exit");
                else
                    System.out.println(i + ". " + menuNumberToActionMap.get(i).getActionName());
            }
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
                System.out.println();
                System.out.println("Do you want to continue? (Enter y)");
                String ch = sc.nextLine();
                if (!ch.equals("y"))
                    break;

            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
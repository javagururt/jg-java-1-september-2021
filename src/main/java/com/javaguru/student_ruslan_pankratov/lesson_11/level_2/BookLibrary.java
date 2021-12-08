package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.student_ruslan_pankratov.lesson_11.level_2.uia.*;
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
        menuNumberToActionMap.put(6, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindSearchUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindTextUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(16, new GetEachAuthorBookCountUIAction(bookDatabase));

    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            System.out.println("1 = Добавление книги");
            System.out.println("2 = Поиск книги по id");
            System.out.println("3 = найти по автору книги");
            System.out.println("4 = найти по названию книгу");
            System.out.println("5 = удалить по id");
            System.out.println("6 = существует ли данная книга в библиотеке");
            System.out.println("7 = число всех книг в библиотеке");
            System.out.println("8 = удалить по автору книги в библиотеке");
            System.out.println("9 = удалить книгу в библиотеке");
            System.out.println("10 = удалить по названию книгу в библиотеке");
            System.out.println("11 = выбрать разные варианты поиска");
            System.out.println("12 = выведит только индивидуальные слова в тексте");
            System.out.println("13 = выведит только индивидуальные книги в библиотеке");
            System.out.println("14 = выведит только индивидуальные название книг в библиотеке");
            System.out.println("15 = выведит все книги автора книг в библиотеке");
            System.out.println("16 = количество книг у авторов в библиотеке");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
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
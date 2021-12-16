package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private final List<ProductAction> productActions;

    public UserInterface(List<ProductAction> productActions) {
        this.productActions = productActions;
    }

    public void startUI() {
        while (true) {
            System.out.println("Menu:");
            try {
                printMenu();
                int menuAction = getMenuAction();
                checkUserInput(menuAction);
                productActions.get(menuAction).execute();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private int getMenuAction() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void checkUserInput(int action) {
        if (action < 0 || action > productActions.size()) {
            throw new IllegalArgumentException("Wrong menu action");
        }
    }

    private void printMenu() {
        for (int i = 0; i < productActions.size(); i++) {
            System.out.println(i + ". " + productActions.get(i).getActionName());
        }
    }
}

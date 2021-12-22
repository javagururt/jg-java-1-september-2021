package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.ui;

public class ExitProductMenuAction implements ProductAction {

    private static final String ACTION_NAME = "Exit";

    @Override
    public void execute() {
        System.out.println("Bye-bye");
        System.exit(0);
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}

package com.javaguru.student_jekaterina_ola.lesson_9.level_2_intern.Task_8;

//Как вы думаете, почему protected классы создавать нельзя?
//        Напиши свой ответ в коментарии над исправленным кодом.

import com.javaguru.teacher.codereview.CodeReview;

// protected class не имеет смысла, так как не будет взаимодействия
@CodeReview(approved = true)
public class ProtectedClass {

    private String title;
    private String author;
}

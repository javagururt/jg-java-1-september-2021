package com.javaguru.student_nikita_simans.homework.lesson_10.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface MyList {

    public void deleteFromListByIndex (int index); // удаление элемента из списка, зная его индекс
    public void deleteFromListByName (String elementName); // удаление элемента из списка, зная его имя
    public void addToList (String elementName); // добавление элемента в конец списка
    public void insertInList (String elementName, int index); // добавление элемента после элемента с определенным индексом
    public void returnValue (int index); // возврат значения элемента с определенным индексом
    public void replaceElementByIndex (int index, String newElement); // замена элемента по индексу
    public void replaceElementByName (String elementName, String newElementName); // замена элемента по имени
}

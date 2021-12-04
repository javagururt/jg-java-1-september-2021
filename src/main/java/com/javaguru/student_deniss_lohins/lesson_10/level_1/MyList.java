package com.javaguru.student_deniss_lohins.lesson_10.level_1;

public interface MyList {

    public void addToList(String element);
        // Добавить элемент в конец списка

    public void deleteFromList(int number);
        //Удалить элемент списка

    public String readElement(int number);
        //вернуть значение элемента


    public void replaceElement(int number, String element);
        //Заменить элемент


    public int returnElementCount();
        //вернуть количество элементов в списке

}

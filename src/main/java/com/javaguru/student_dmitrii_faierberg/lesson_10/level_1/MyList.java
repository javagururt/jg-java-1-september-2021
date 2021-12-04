package com.javaguru.student_dmitrii_faierberg.lesson_10.level_1;

public interface MyList {
    //Добавить элемент в конец списка
    void add(int element);

    //Вернуть элемент под индексом и удалить его
    int remove(int index);

    //Вставить элемент
    void insert(int index);
}

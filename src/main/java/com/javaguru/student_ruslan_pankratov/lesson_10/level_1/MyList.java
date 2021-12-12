package com.javaguru.student_ruslan_pankratov.lesson_10.level_1;

import com.javaguru.teacher.codereview.CodeReview;

//Tack_3
@CodeReview(approved = true)
interface MyList {

    void addElement();//Будет добавлять элемент в список и расширять его размер

    void deleteElement();//будет удалять из списка элемент, и сокращать размер массива

    void clear();// очистит весь список
}

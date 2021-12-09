package com.javaguru.student_ruslan_pankratov.lesson_10.level_7;

import com.javaguru.teacher.codereview.CodeReview;

//Task_26
@CodeReview(approved = true)
interface MyList {

    void addElement(MyList myList);

    void deleteElement(int index);

    void clear();


}

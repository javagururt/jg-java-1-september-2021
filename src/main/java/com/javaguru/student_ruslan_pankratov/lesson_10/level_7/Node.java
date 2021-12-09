package com.javaguru.student_ruslan_pankratov.lesson_10.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Node{
    int data;
    Node prev;
    Node next;

    public Node (int date){
        this.data = date;
        this.prev = null;
        this.next = null;
    }
}
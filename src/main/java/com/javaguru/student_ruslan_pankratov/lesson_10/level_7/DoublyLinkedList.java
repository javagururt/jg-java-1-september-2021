package com.javaguru.student_ruslan_pankratov.lesson_10.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DoublyLinkedList{
     Node head;

    void addNode (){
          head = new Node(5);
          Node after = new Node(7);

          head.next = after;
          after.prev = head;

          Node before = new Node(3);
          head.prev = before;
          before.next = head;

          head = before;
    }

    void addToEnd(int date){

        Node n = new Node(date);
        if(head == null){
            head = n;
        } else {
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = n;
            n.prev = curr;
        }
    }

    void addToStart(int date){
        Node n = new Node(date);
        if(head == null){
            head = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }




     public DoublyLinkedList (Node head){
         this.head = head;
     }

}

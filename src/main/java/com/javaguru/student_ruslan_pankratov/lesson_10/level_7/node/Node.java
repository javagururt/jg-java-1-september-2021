package com.javaguru.student_ruslan_pankratov.lesson_10.level_7.node;

public class Node {
    private Object data;
    private Node next;
    private Node befor;

    public Node() {

    }

    public Node(Object data) {
        super();
        this.data = data;
    }

    public Node getBefor() {
        return befor;
    }

    public void setBefor(Node befor) {
        this.befor = befor;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


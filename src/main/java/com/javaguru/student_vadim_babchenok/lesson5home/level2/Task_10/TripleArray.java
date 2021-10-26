package com.javaguru.student_vadim_babchenok.lesson5home.level2.Task_10;
/*Написать программу, в которой:
        - создать массив целых чисел длиной 3,
        - заполнить каждую ячейку массива любым числом,
        - вывести значение каждой ячейки на консоль.*/
public class TripleArray {
    public static void main(String[] args) {
        int[] nums1;
        nums1=new int[3];
        nums1[0]= 1;
        nums1[1]= 2;
        nums1[2]=3;
        System.out.println(nums1[0]+" "+nums1[1]+" "+nums1[2]);
    }
}

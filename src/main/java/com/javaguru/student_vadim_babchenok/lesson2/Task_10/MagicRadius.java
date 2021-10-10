package com.javaguru.student_vadim_babchenok.lesson2.Task_10;

import java.util.Scanner;

public class MagicRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Radius date:  ");
        float r = input.nextFloat();
        System.out.println("Circle length is = " + (2 * 3.1415926 * r));
        System.out.println("Area is = " + (3.1415926 * r * r));
    }
}
package com.javaguru.teacher.lesson_3.lessoncode;

import java.util.Scanner;

class CatApplication {

    public static void main(String[] args) {
        System.out.println("Please enter cat name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Cat myCat = new Cat(name);
        System.out.println("Cat name = " + myCat.name);
    }
}

package com.javaguru.teacher.lesson_9_objects_equality.lessoncode;

class StringExample {

    public static void main(String[] args) {
        String cat = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");

        if (cat == cat2) {
            System.out.println("cat == cat2 = true");
        } else {
            System.out.println("cat == cat2 = false");
        }

        if (cat == cat3) {
            System.out.println("cat == cat3 = true");
        } else {
            System.out.println("cat == cat3 = false");
        }

        if (cat.equals(cat2)) {
            System.out.println("cat.equals(cat2) = true");
        }

        if (cat.equals(cat3)) {
            System.out.println("cat.equals(cat3) = true");
        } else {
            System.out.println("cat.equals(cat3) = false");
        }

        String result = "a" + "b" + "c" + "d" + "e";

        System.out.println(result);

    }
}

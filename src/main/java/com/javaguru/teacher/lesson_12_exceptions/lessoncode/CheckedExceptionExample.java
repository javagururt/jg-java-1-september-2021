package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

class CheckedExceptionExample {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            throwException();
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("Sorry");
            System.out.println(e.getMessage());
        }
    }

    private static void throwException() throws Exception {
        throw new Exception("Checked exception");
    }
}

package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

class UncheckedExceptionExample {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            throwRuntimeException();
            System.out.println("B");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("C");
    }

    private static void throwRuntimeException() {
        throw new RuntimeException("Unchecked exception");
    }
}

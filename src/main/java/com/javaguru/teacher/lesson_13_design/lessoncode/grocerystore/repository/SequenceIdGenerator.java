package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.repository;

public class SequenceIdGenerator {

    private static long sequenceId;

    private SequenceIdGenerator() {
    }

    public static long generateId() {
        return sequenceId++;
    }
}

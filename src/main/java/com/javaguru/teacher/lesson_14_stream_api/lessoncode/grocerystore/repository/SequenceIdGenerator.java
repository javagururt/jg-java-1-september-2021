package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository;

public class SequenceIdGenerator {

    private static long sequenceId;

    private SequenceIdGenerator() {
    }

    public static long generateId() {
        return sequenceId++;
    }
}

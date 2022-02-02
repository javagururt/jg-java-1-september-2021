package com.javaguru.student_deniss_lohins.lesson_12.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@CodeReview(approved = true)
class OutOfMemoryError {
    public static void main(String[] args) {
        List<Book> victim = new ArrayList<>();
        int repeats = 100_000_000;
        Long start = System.currentTimeMillis();
        for (int i = 0; i < repeats; i++) {
            String author = "Author" + i;
            victim.add(new Book(author, UUID.randomUUID()));
        }
        Long finish = System.currentTimeMillis();
        Long result = (finish - start) / 1000;
        System.out.println("Done " + repeats/1000 + " thousands of objects");
        System.out.println("Result: " + result + " s");
    }
}

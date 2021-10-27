package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_5.lessoncode;

class IncrementExample {

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i); // 0

        System.out.println(i++); // 0
        System.out.println(i); // 1

        System.out.println(++i); // 2
        System.out.println(i); // 2
        System.out.println(i++); // 2
        System.out.println(++i); // 4

        int result = i++ + ++i - i++;
        System.out.println(result);

        int counter = 0;
        counter = counter + 20;
        System.out.println(counter);
        counter += 20;
        System.out.println(counter);
    }
}

package com.javaguru.teacher.lesson_14_stream_api.lessoncode;

import java.util.Optional;
import java.util.Random;

class ExampleOptional {


    public static void main(String[] args) {
//       Integer number = generateNumberOrNull();
//       if (number != null) {
//           int intNumber = number.intValue();
//
//           System.out.println(intNumber);
//       }

        generateNumber()
                // optional integer
                .map(intNum -> intNum.toString())
                // Optional String
                .ifPresent(num -> System.out.println(num));
    }

    private static Integer noname(Integer intNum) {
        return intNum.intValue();
    }

    private static Optional<Integer> generateNumber() {
        Random random = new Random();
        int number = random.nextInt(101);
        if (number <= 50) {
            return Optional.of(number);
        } else {
            return Optional.empty();
        }
    }
}

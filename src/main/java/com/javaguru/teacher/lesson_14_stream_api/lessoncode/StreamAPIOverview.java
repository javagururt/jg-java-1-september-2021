package com.javaguru.teacher.lesson_14_stream_api.lessoncode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class StreamAPIOverview {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>(Arrays.asList("Ruslan", "Oleg", "Dmitry", "Denis", "Jekaterina", "Mihail"));
//        List<String> names = List.of("Ruslan", "Oleg", "Dmitry", "Denis", "Jekaterina", "Mihail");
        List<String> names = List.of("Ruslan", "Oleg", "Dmitry", "Denis", "Jekaterina", "Mihail");
//        List<String> names = new ArrayList<>();
//        names.add("Olga");
        names.stream()
                .filter(name -> name.length() > 5)
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 5)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(filteredNames);

        List<String> filteredNames2 = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.length() > 5) {
                String upperCaseName = name.toUpperCase();
                filteredNames2.add(upperCaseName);
            }
        }

        System.out.println(filteredNames2);


        List<Integer> integers = List.of(2, 4, 3, 5, 7, 1, 9);
        int result = 0;
        for (int i = 0; i < integers.size(); i++) {
            result = result + integers.get(i);
        }
        System.out.println("Sum result = " + result);

        int sumResult = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum result = " + sumResult);

        List<BigDecimal> bigDecimals = List.of(
                new BigDecimal("10"),
                new BigDecimal("30.5"),
                new BigDecimal("50.3"),
                new BigDecimal("100.01")
        );

        BigDecimal sumBigDecimalResult = bigDecimals.stream()
                .filter(v -> isGreaterThan(v, new BigDecimal("50")))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(sumBigDecimalResult);


        Optional<BigDecimal> optionalBigDecimal = bigDecimals.stream()
                .filter(v -> isGreaterThan(v, new BigDecimal("30")))
                .findFirst();

        if (optionalBigDecimal.isPresent()) {
            System.out.println("...");
        }

        optionalBigDecimal.ifPresent(bd -> System.out.println("Found"));

        optionalBigDecimal.ifPresentOrElse(
                bd -> System.out.println("Found: " + bd),
                () -> System.out.println("Not found")
        );

        BigDecimal withDefaultResult = bigDecimals.stream()
                .filter(v -> isGreaterThan(v, new BigDecimal("30")))
                .findFirst()
                .orElse(BigDecimal.ZERO);

        System.out.println(withDefaultResult);
    }

    private static boolean isGreaterThan(BigDecimal v, BigDecimal toCompare) {
        return v.compareTo(toCompare) >= 1;
    }
}

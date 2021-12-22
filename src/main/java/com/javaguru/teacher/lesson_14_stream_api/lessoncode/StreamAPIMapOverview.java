package com.javaguru.teacher.lesson_14_stream_api.lessoncode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StreamAPIMapOverview {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Ruslan", 10,
                "Oleg", 20,
                "Dmitry", 30,
                "Denis", 40,
                "Jekaterina",25,
                "Mihail",50);

        List<Integer> sortedValues = map.entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(value -> value >= 30)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedValues);
    }
}

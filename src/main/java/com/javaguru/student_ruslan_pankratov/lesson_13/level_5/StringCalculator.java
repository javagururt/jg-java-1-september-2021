package com.javaguru.student_ruslan_pankratov.lesson_13.level_5;

class StringCalculator {
    int add(String numbers) {
        int sum = 0;
        if (!numbers.endsWith("\n")) { //endsWith позволяет проверять последнюю строку стринга
            //проверяет первую строку startsWith
            String[] arr = numbers.split("");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].matches("[0-9]*")) {
                    int res = Integer.parseInt(arr[i]);
                    sum += res;
                }
            }
        } else {
            throw new IllegalArgumentException("invalid character \n");
        }
        return sum;
    }
}

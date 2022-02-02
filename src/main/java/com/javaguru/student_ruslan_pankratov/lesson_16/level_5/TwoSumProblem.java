package com.javaguru.student_ruslan_pankratov.lesson_16.level_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class TwoSumProblem {
    public static void main(String[] args) {
        TwoSumProblem twoSumProblem = new TwoSumProblem();
        int[] arr = new int[100000];
       twoSumProblem.result(arr,8,5,3);
      //  twoSumProblem.chek(arr,13,3,6,4);

    }

    void field(int[] arr, int num1, int num2){
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length / 2){
                arr[i] = num1;
            } else if(i == arr.length/ 1.5){
                arr[i] = num2;
            } else {
                arr[i] = 2;
            }
        }
    }

    void fieldThree(int[] arr, int num1, int num2, int num3){
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length / 2){
                arr[i] = num1;
            } else if(i == arr.length/ 1.5){
                arr[i] = num2;
            } else if (i == arr.length / 1.11){
                arr[i] = num3;
            } else {
                arr[i] = 2;
            }
        }
    }


    String twoNumbersOneSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    int sum = arr[i] + arr[j];
                    if (sum == target) {
                        return arr[i] + " + " + arr[j] + " = " + target;
                    }
                }
            }
        }
        return "нет подходящих чисел";
    }


    String twoNumbersOneSum2(int[] arr, int target) { //самый быстрый вариант за счёт того, что он не будет
        // проверерять предыдущие ячейки
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = k; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return arr[i] + " + " + arr[j] + " = " + target;
                }
            }
            k++;
        }
        return "нет подходящих чисел";
    }

    String twoNumbersMap3(int[] arr, int target) {
        Map<Integer, Integer> mapa = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int value1 = arr[i];
            int value2 = target - value1;
            if (mapa.containsValue(value2)) {
                return value1 + " + " + value2 + " = " + target;
            } else {
                mapa.put(i, value1);
            }
        }
        return "Nothing found";
    }


    String twoNumbersMap(int[] arr, int target) { //самый медленый
        Map<Integer, Integer> twoNumber = new HashMap();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            int examination = target - arr[i];
            if (examination > 0) {
                twoNumber.put(j, arr[i]);
                j++;
            }
        }
        for (int i = 0; i < twoNumber.size(); i++) {
            int examination = target - twoNumber.get(i);
            for (int k = 0; k < twoNumber.size(); k++) {
                if ( i != k) {
                    if (examination == twoNumber.get(k)) {
                        return twoNumber.get(i) + " + " + twoNumber.get(k) + " = " + target;
                    }
                }
            }
        }
        return "";
    }

    String threeNumber(int[] arr, int target){

        int plusJ = 1;
        int plusK = 2;
        int plusKFor = 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = plusJ; j < arr.length; j++) {
                for (int k = plusK; k < arr.length; k++) {
                    int resultThreeNumber = arr[i] + arr[j] + arr[k];
                    if(resultThreeNumber == target){
                        if (i != j && i != k && k != j ) {
                            return arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + target;
                        }
                        }
                }
                plusK ++;

            }
            plusK ++;
            plusK  = plusKFor;
            plusJ ++;
        }
        return "не найдены варианты";
    }

    void chek(int[] arr, int target, int num1, int num2, int num3){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        fieldThree(arr, num1, num2, num3);
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        threeNumber(arr,target);
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date1));


    }

    void result (int[] arr, int target, int num1, int num2 ){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");


        field(arr, num1, num2);
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        twoNumbersOneSum(arr,target); //10 секунд   43 быстрее в 1.7 раза чем twoNumbersMap3 медленее в 4.3
        //чем twoNumbersOneSum2
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date1));
       // twoNumbersMap(arr,target);//1 минута и 6 секунд, второй раз не проверял
       // Date date2 = new Date(System.currentTimeMillis());
       // System.out.println(formatter.format(date2));
        twoNumbersMap3(arr, target); // 14 секунд  1 минута и 13 секунд медленее в 1.7 паз чем  twoNumbersOneSum
        //медленее в 7.3 раза чем twoNumbersOneSum2
        Date date3 = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date3));
        twoNumbersOneSum2(arr,target);//2  10
        Date date4 = new Date();
        System.out.println(formatter.format(date4));


    }
}

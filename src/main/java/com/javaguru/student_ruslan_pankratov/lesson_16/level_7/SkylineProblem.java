package com.javaguru.student_ruslan_pankratov.lesson_16.level_7;

import java.util.ArrayList;
import java.util.List;

class SkylineProblem {

    public static void main(String[] args) {
        SkylineProblem skylineProblem = new SkylineProblem();
        int[][] field = {{2, 5, 5}, {3, 4, 6}};
        skylineProblem.method(field);
    }

    List<List<Integer>> addArr = new ArrayList<>();

    void method(int[][] field) {
        int arrNumber = lastNumber(field);
        System.out.println(arrNumber);
        int[][] number = new int[arrNumber][2];
        fieldCheck(number);
        createArr(field, number);
    }

    void createArr(int[][] field, int[][] chekArr) {
        for (int i = 0; i < field.length; i++) {
            List<Integer> addList = new ArrayList<>();
            for (int j = field[i][0]; j <= field[i][1]; j++) {
                addList.add(j);
                if (j == field[i][1]) {
                    addList.add(field[i][2]);
                }
            }
            addArr.add(addList);
        }

        for (int i = 0; i < addArr.size(); i++) {
            for (int j = 0; j < addArr.get(i).size() - 1; j++) {
                for (int k = 0; k < chekArr.length; k++) {
                    if (addArr.get(i).get(j) == chekArr[k][0]) {
                        if (chekArr[k][1] < addArr.get(i).get(addArr.get(i).size() - 1)) {
                            chekArr[k][1] = addArr.get(i).get(addArr.get(i).size() - 1);
                        }
                    }
                }


            }

            for (int k = 0; k < chekArr.length; k++) {
                System.out.print(chekArr[k][0]);
                System.out.print(chekArr[k][1]);

                System.out.println("");
            }
        }
        int maxNumber = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < chekArr.length; i++) {
            List<Integer> cordinat = new ArrayList<>();
            if (chekArr[i][1] > maxNumber) {
                maxNumber = chekArr[i][1];
               cordinat.add(chekArr[i][0]);
               cordinat.add(chekArr[i][1]);
               result.add(cordinat);
            } else if(chekArr[i][1] < maxNumber){
                cordinat.add(chekArr[i][0]);
                cordinat.add(chekArr[i][1]);
                maxNumber = chekArr[i][1];
                result.add(cordinat);
            }

        }



        for (int i = 0; i <result.size() ; i++) {

                System.out.print("Точка = "+ result.get(i).get(0) + ", Высота точки = " + result.get(i).get(1));
            System.out.println("");
        }
    }

    void fieldCheck(int[][] field) {
        for (int i = 0; i < field.length; i++) {

            field[i][0] = i + 1;
            field[i][1] = 0;

        }
    }

    int lastNumber(int[][] field) {
        int max = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][1] > max) {
                    max = field[i][1];
                }
            }
        }
        return max;
    }
}

package com.javaguru.student_georgijs_kuznecovs.lesson_6.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public boolean findNumber(int number, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                return true;
            }
        }
        return true;
    }

    public int countNumbers(int number, int[] array){
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                num++;
            }
        }
        return num;
    }

    void replace(int[] arr, int numberToReplace, int newNumber){
        arr[numberToReplace] = newNumber;
    }

    void replaceAll(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

    void reverse (int[] arr){                  //google jr
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

   /* void sortArray (int[] arr){                     //google sj  https://youtu.be/Ns4TPTC8whw
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }*/

    void sort (int[] arr){                     //https://youtu.be/lyZQPjUT5B4
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }


}

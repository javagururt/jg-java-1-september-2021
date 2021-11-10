package com.javaguru.student_georgijs_kuznecovs.lesson_6.level_3;

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

    void reverseArray (int[] arr){                  //google jr
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }


}

package com.javaguru.student_dmitrii_faierberg.lesson_6.level_3_junior_and_task14;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {
    public boolean isNumberInArray(int[] array, int number){
        for (int i = 0; i < array.length; i++){
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int countHowOftenNumberInArray(int[] array, int number){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number) {
                counter++;
            }
        }
        return counter;
    }

    void replace(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
                return;
            }
        }
    }

    void replaceAll(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
            }
        }
    }

    void reverseArray(int arr[]){
        int[] tempArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--){
            tempArray[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = tempArray[i];
        }
        //arr = tempArray.clone();
    }

    void quickSort(int[] arr){
        qs(arr, 0, arr.length-1);
    }
    
    private void qs(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        int partitionIndex = partition(arr, left, right);

        qs(arr, left, partitionIndex-1);
        qs(arr, partitionIndex + 1, right);

    }

    private int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int j = left;
        for (int i = left + 1; i <= right; i++){
            if (arr[i] <= pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        return j;
    }
}

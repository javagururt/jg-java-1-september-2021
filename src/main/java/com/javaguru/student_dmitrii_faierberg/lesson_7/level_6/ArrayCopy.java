package com.javaguru.student_dmitrii_faierberg.lesson_7.level_6;

class ArrayCopy {

    public int[] copyInRange(int[] in, int numberFrom, int numberTo){
        int[] result = new int[numberTo - numberFrom  + 1];
        int resultIndex = 0;
        for(int i = 0; i < in.length; i++){
            if (i >= numberFrom && i <= numberTo){
                result[resultIndex] = in[i];
                resultIndex++;
            }
        }
        return result;
    }
}

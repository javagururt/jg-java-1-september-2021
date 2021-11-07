package com.javaguru.student_deniss_lohins.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        String interimResult = "";
        for (int i = 0; i < in.length; i++) {
            if(in[i] >= numberFrom && in[i] <= numberTo){
                interimResult = interimResult + in[i] + ",";
            }
        }
        if(interimResult.length() == 0){
            int[] emptyArry = new int[0];
            return emptyArry;
        }
        String[] stringArray = interimResult.split(",");
        int[] resultToReturn = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            resultToReturn[i] = Integer.parseInt(stringArray[i]);
        }
        return resultToReturn;
    }
}

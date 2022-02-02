package com.javaguru.student_ruslan_pankratov.lesson_16.level_6;

class TappingRainWaterProblem {


    //        П П     П    2
    //  П     П П     П    4
    //  П   П П П   П П    2
    //0 2 0 1 3 3 0 1 2
    public static void main(String[] args) {
        TappingRainWaterProblem tappingRainWaterProblem = new TappingRainWaterProblem();
        int[] waterFillingArea ={0,2,0,1,3,3,0,1,3}; //должно быть 8
      int result =  tappingRainWaterProblem.calculusOfWater(waterFillingArea);
        System.out.println(result);
    }


    int calculusOfWater(int[] field){
        int result = 0;

        while (true) {
            int maxNumber = 0;
            for (int i = 0; i < field.length; i++) {
                if(field[i] > maxNumber){
                    maxNumber = field[i];
                }
            }
            int sizeForWater = 0;
            for (int i = 0; i < field.length; i++) {
                if(maxNumber == field[i]){
                    int breakInt = 0;
                    for (int j = i + 1; j < field.length; j++) {
                          if(breakInt == 0) {
                              if (field[j] == maxNumber) {
                                  result += sizeForWater;
                               breakInt = 1;

                              }

                              sizeForWater++;
                          }
                    }
                    sizeForWater = 0;
                }
            }
            for (int i = 0; i < field.length; i++) {
                if (maxNumber == field[i]){
                    field[i] -= 1;
                }
            }

            if (maxNumber == 0){
                return result;
            }
        }
    }
}

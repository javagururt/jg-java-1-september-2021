package com.javaguru.student_deniss_lohins.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
К описанию продукта выдвигаются следующие требования:
- не должно быть длиннее 2000 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы
 */
class DescriptionValidation {
    private int maxLength = 2000;
    private Integer[] acceptableCharsASCII = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84,
            85, 86, 87, 88, 89, 90};

    boolean isValid(String description){
        if(isValidDescriptionLength(description)){
            if ((isValidDescriptionSymbols(description))){
                return true;
            }else{
                new ValidationException("isValidDescriptionSymbols failed");
            }
        }else{
            new ValidationException("isValidDescriptionLength failed");
        }
        return false;
    }
    boolean isValidDescriptionLength(String description){
        if (description.length() < maxLength){
            return true;
        }else{
            return false;
        }
    }
    boolean isValidDescriptionSymbols(String description){
        List<Integer> symbolListASCII = new ArrayList<Integer>(acceptableCharsASCII.length);
        for (int i : acceptableCharsASCII) {
            symbolListASCII.add(i);
        }

        if (description == null) {
            return false;
        }
        String testName = description.toUpperCase(Locale.ROOT);
        for (int i = 0; i < testName.length(); i++) {
            char testChar = testName.charAt(i);
            Integer ascii = (int) testChar;
            if (!symbolListASCII.contains(ascii)) {
                return false;
            }
        }
        return true;
    }
}

package com.javaguru.student_deniss_lohins.lesson_12.level_5;

import java.util.*;
import java.util.stream.Collectors;

/*
К названию продукта выдвигаются следующие требования:
- не должно быть пустым
- не должно быть короче 3 символов
- не должно быть длиннее 100 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы
 */
class NameValidation {
    private int minimalLength = 3;
    private int maximalLength = 100;
    private Integer[] acceptableCharsASCII = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84,
            85, 86, 87, 88, 89, 90};


    boolean isValid(String name){
        if (isValidSymbols(name)){
            if(isValidMinLength(name)){
                if(isValidMaxLength(name)){
                    return true;
                }else{
                    new ValidationException("isValidMaxLength failed");
                }
            }else{
                new ValidationException("isValidMinLength failed");
            }
        }else{
            new ValidationException("isValidSymbols failed");
        }
        return false;
    }

    boolean isValidSymbols(String name) {
        List<Integer> symbolListASCII = new ArrayList<Integer>(acceptableCharsASCII.length);
        for (int i : acceptableCharsASCII) {
            symbolListASCII.add(i);
        }

        if (name == null) {
            return false;
        }
        String testName = name.toUpperCase(Locale.ROOT);
        for (int i = 0; i < testName.length(); i++) {
            char testChar = testName.charAt(i);
            Integer ascii = (int) testChar;
            if (!symbolListASCII.contains(ascii)) {
                return false;
            }
        }
        return true;
    }
    boolean isValidMinLength(String name){
        if(name.length() < minimalLength){
            return false;
        }
        return true;
    }
    boolean isValidMaxLength(String name){
        if (name.length() > maximalLength){
            return false;
        }
        return true;
    }
}


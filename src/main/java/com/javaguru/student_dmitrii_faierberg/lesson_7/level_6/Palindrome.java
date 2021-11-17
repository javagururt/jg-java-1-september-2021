package com.javaguru.student_dmitrii_faierberg.lesson_7.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import javax.security.auth.callback.CallbackHandler;
@CodeReview(approved = true)
class Palindrome {

    public boolean isPalindrome(String text){
        Character[] initialSymbols = new Character[text.length()];
        int indexForInitialSymbols = 0;

        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                initialSymbols[indexForInitialSymbols] = Character.toLowerCase(text.charAt(i));
                indexForInitialSymbols++;
            }
        }
        indexForInitialSymbols = 0;
        for(int i = text.length()-1; i > 0; i--){
            if (text.charAt(i) != ' '){
                if (initialSymbols[indexForInitialSymbols] == Character.toLowerCase(text.charAt(i))){
                    indexForInitialSymbols++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

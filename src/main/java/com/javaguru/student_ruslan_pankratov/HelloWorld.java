package com.javaguru.student_ruslan_pankratov;

public class HelloWorld {
    public static void main(String[] args) {
        String res = "Fer";
      String[] result = res.split("");
        if(result[0].matches("[A-Z]")){
            System.out.println("1sc");
        }
    }
}

package com.javaguru.student_ruslan_pankratov.lesson_12.level_3;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
          NullPointerExceptionDemo nullPointerExceptionDemo = new NullPointerExceptionDemo();
          String res = nullPointerExceptionDemo.method();
          if(res.equals("1232")){// NullPointerException происходит, когда мы хотим взаимодействовать с нулом


          }

    }

    String method(){
        return null;
    }
}

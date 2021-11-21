package com.javaguru.student_ruslan_pankratov.lesson_8.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Task_8
@CodeReview(approved = true)
 class ComputerPlayerDemo extends ComputerPlayer {


     public static void main(String[] args) {
         ComputerPlayer computerPlayer = new ComputerPlayer("Staley");
     }
     public ComputerPlayerDemo(String name) {
         super(name);
     }
 }

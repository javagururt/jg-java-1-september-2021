package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_2;


public class DayOfTheWeekDetectorTETS2 implements DayOfTheWeekDetector {

        public String detectDayName(int number) {
            if(number <= 7 && number >= 1){
                return arr[number - 1];
            } else {
                return arr[7];
            }

        }

        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
                , "Please input a valid number between 1 and 7"};


        public String monday() {
            return "Monday";
        }


        public String tuesday() {
            return "Tuesday";
        }


        public String wednesday() {
            return "Wednesday";
        }


        public String thursday() {
            return "Thursday";
        }


        public String friday() {
            return "Friday";
        }


        public String saturday() {
            return "Saturday";
        }


        public String sunday() {
            return "Sunday";
        }


        public String noCorrect() {
            return "Please input a valid number between 1 and 7";
        }
    }


package com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Trader {
        private String name;
        private String city;

        public Trader(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getName() {
            return this.name;
        }

        public String getCity() {
            return this.city;
        }

        public String toString() {
            return "Trader:"+this.name + " in " + this.city;
        }
    }

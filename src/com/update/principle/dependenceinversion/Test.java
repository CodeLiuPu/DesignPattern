package com.update.principle.dependenceinversion;


public class Test {
    public static void main(String[] args) {
        Update update = new Update() ;
        update.studyCourse(new JavaCourse());
        update.studyCourse(new FECourse());
    }

}

package com.update.principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("update 在学习java");
    }
}

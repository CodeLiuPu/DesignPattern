package com.update.principle.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("update 在学习前端");
    }
}

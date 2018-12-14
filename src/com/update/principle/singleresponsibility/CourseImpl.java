package com.update.principle.singleresponsibility;

public class CourseImpl implements ICourseManager, ICourseContent {

    String name;
    String video;

    public CourseImpl(String name, String video) {
        this.name = name;
        this.video = video;
    }


    @Override
    public String getCourseName() {
        return name;
    }

    @Override
    public String getCourseVideo() {
        return video;
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}

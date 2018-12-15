package com.update.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java课程")
                .buildCoursePPT("JavaPPT")
                .buildCourseVideo("Java视频")
                .buildCourseArticle("Java手记")
                .buildCourseQA("JavaQA")
                .build();
        System.out.println(course);
    }
}

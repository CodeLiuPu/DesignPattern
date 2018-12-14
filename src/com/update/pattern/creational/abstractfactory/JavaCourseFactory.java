package com.update.pattern.creational.abstractfactory;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}

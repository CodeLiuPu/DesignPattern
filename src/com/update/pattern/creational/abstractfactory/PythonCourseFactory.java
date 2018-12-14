package com.update.pattern.creational.abstractfactory;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}

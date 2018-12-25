package com.update.pattern.behavior.templatemethod;

/**
 * @author : liupu.
 * @date : 2018/12/25
 */
public class Test {
    public static void main(String[] args) {

        ACourse dedignCourse = new DesignPatternCourse();
        dedignCourse.makeCourse();

        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
    }
}

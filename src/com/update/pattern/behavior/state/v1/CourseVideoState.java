package com.update.pattern.behavior.state.v1;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public abstract class CourseVideoState extends CourseVideoContext {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}

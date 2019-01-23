package com.update.pattern.behavior.state.v1;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public class CourseVideoContext {
    private CourseVideoState courseVideoState;
    public final static CourseVideoState PLAY_STATE = new PlayState();
    public final static CourseVideoState SPEED_STATE = new SpeedState();
    public final static CourseVideoState PAUSE_STATE = new PauseState();
    public final static CourseVideoState STOP_STATE = new StopState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void stop() {
        this.courseVideoState.stop();
    }
}

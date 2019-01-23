package com.update.pattern.behavior.state.v1;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常输出播放视频状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}

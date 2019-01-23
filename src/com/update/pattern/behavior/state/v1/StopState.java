package com.update.pattern.behavior.state.v1;

/**
 * @author : liupu.
 * @date : 2019/01/23
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("Error 视频已停止 不能加速");
    }

    @Override
    public void pause() {
        System.out.println("Error 视频已停止 不能暂停");

    }

    @Override
    public void stop() {
        System.out.println("停止播放视频");
    }
}

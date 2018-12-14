package com.update.pattern.creational.simplefactory;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}

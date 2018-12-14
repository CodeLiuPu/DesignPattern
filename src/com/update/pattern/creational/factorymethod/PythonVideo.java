package com.update.pattern.creational.factorymethod;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}

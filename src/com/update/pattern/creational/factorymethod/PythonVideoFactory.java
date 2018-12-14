package com.update.pattern.creational.factorymethod;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}

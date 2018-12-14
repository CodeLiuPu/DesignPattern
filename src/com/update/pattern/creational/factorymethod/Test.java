package com.update.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        Video javaVideo = javaVideoFactory.getVideo();
        javaVideo.produce();

    }
}

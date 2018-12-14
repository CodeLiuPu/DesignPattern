package com.update.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
////        Video video = videoFactory.getVideo(VideoFactory.VIDEO_TYPE_JAVA);
//        Video video = videoFactory.getVideo(VideoFactory.VIDEO_TYPE_PYTHON);
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}

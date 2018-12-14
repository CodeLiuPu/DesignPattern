package com.update.pattern.creational.simplefactory;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class VideoFactory {

    public static final String VIDEO_TYPE_JAVA = "java";
    public static final String VIDEO_TYPE_PYTHON = "python";

//    public Video getVideo(String type) {
//        if (VIDEO_TYPE_JAVA.equals(type)) {
//            return new JavaVideo();
//        } else if (VIDEO_TYPE_PYTHON.equals(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }

    // 使用反射来实现
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}

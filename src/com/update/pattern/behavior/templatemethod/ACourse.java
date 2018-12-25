package com.update.pattern.behavior.templatemethod;

/**
 * @author : liupu.
 * @date : 2018/12/25
 */
public abstract class ACourse {

    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteArticle()){
            writeArticle();
        }
        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作ppt");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}

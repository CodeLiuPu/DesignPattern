package com.update.pattern.behavior.chainofresponsibility;



/**
 * @author : liupu.
 * @date : 2018/12/16
 */
public class VideoApprover extends Approver{

    @Override
    public void deploy(Course course) {
        String video = course.getVideo();
       if (null != video && !video.equalsIgnoreCase("")){
           System.out.println(course.getName() + " 含有视频");
           if (approver != null){
               approver.deploy(course);
           }
       } else{
           System.out.println(course.getName() + " 不包含视频,流程结束");
           return;
       }
    }
}

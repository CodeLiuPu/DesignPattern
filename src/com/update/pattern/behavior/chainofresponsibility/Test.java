package com.update.pattern.behavior.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java课程");
        course.setVideo("Java视频");
        course.setArticle("Java手记");

        videoApprover.setNext(articleApprover);

        videoApprover.deploy(course);


    }
}

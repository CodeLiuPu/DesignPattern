package com.update.pattern.behavior.chainofresponsibility;



/**
 * @author : liupu.
 * @date : 2018/12/16
 */
public class ArticleApprover extends Approver{

    @Override
    public void deploy(Course course) {
        String article = course.getArticle();
       if (null != article && !article.equalsIgnoreCase("")){
           System.out.println(course.getName() + " 含有手记");
           if (approver != null){
               approver.deploy(course);
           }
       } else{
           System.out.println(course.getName() + " 不包含手记,流程结束");
           return;
       }
    }
}

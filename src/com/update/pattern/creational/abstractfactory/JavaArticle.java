package com.update.pattern.creational.abstractfactory;

/**
 * @author : liupu.
 * @date : 2018/12/14
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Java手记");
    }
}

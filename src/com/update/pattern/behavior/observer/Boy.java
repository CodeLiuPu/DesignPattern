package com.update.pattern.behavior.observer;

/**
 * @author : liupu.
 * @date : 2018/12/16
 */
public class Boy implements Observer {

    private String name;
    public Boy(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到了信息:" + message);
    }
}

package com.update.pattern.behavior.observer;

/**
 * @author : liupu.
 * @date : 2018/12/16
 */
public class Girl implements Observer {

    private String name;
    public Girl(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到了信息:" + message);
    }
}

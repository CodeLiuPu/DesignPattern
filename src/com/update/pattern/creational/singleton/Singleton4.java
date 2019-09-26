package com.update.pattern.creational.singleton;

/**
 * @author : liupu
 * date    : 2019/9/26
 * desc    : 枚举
 * github : https://github.com/CodeLiuPu/
 */
public enum Singleton4 {
    // 定义一个枚举元素 他就是单例
    INSTANCE;
    public void doSomeThing(){
        System.out.println("do some thing");
    }
}
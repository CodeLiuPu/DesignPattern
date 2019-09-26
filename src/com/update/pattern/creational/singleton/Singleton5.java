package com.update.pattern.creational.singleton;

/**
 * @author : liupu
 * date    : 2019/9/26
 * desc    : 静态内部类
 * github : https://github.com/CodeLiuPu/
 */
public class Singleton5 {
    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static final Singleton5 instance = new Singleton5();
    }
}
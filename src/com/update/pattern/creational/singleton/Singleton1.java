package com.update.pattern.creational.singleton;

/**
 * @author : liupu
 * date    : 2019/9/26
 * desc    : 懒汉式
 * github : https://github.com/CodeLiuPu/
 */
public class Singleton1 {
    private Singleton1() {
    }

    private static final Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}
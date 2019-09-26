package com.update.pattern.creational.singleton;

/**
 * @author : liupu
 * date    : 2019/9/26
 * desc    : 饿汉式
 * github : https://github.com/CodeLiuPu/
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (null == instance) {
            // 睡眠 模拟多线程抢占资源
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            instance = new Singleton2();
        }
        return instance;
    }
}
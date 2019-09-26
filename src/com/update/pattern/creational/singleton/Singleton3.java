package com.update.pattern.creational.singleton;

/**
 * @author : liupu
 * date    : 2019/9/26
 * desc    : 双重检查锁
 * github : https://github.com/CodeLiuPu/
 */
public class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        // 为了不必要的同步
        if (null == instance) {
            synchronized (Singleton3.class) {
                // 为了在实例为null的情况下创建实例
                if (null == instance) {
                    instance = new Singleton3();
                    // 1. 分配内存给对象
                    // 2. 初始化对象
                    // 3. 设置改对象指向刚分配的地址
                }
            }
        }
        return instance;
    }
}
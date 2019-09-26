package com.update.pattern.creational.singleton;

/**
 * @author : liupu
 * date    : 2019/9/26
 * desc    :
 * github : https://github.com/CodeLiuPu/
 */
public class Test {

    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton2.getInstance().hashCode());
                }
            }).start();
        }
    }
}

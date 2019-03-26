package com.update.pattern.structural.facade;

/**
 * @author : liupu.
 * @date : 2019/03/26
 */
public class Test {
    public static void main(String[] args) {
        GameSdk.getInstance().init();

        GameSdk.getInstance().login();

        GameSdk.getInstance().pay();
    }
}

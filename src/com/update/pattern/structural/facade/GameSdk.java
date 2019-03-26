package com.update.pattern.structural.facade;

/**
 * @author : liupu.
 * @date : 2019/03/26
 */
public class GameSdk {

    private GameSdk() {
    }

    private static GameSdk instance;

    public static GameSdk getInstance() {
        if (null == instance) {
            synchronized (GameSdk.class) {
                if (null == instance) {
                    instance = new GameSdk();
                }
            }
        }
        return instance;
    }

    public void init() {
        new GameInitService().init();
    }

    public void login() {
        new GameLoginService().login();
    }


    public void pay() {
        new GamePayService().pay();
    }

}

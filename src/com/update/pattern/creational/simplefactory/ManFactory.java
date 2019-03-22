package com.update.pattern.creational.simplefactory;

/**
 * @author : liupu.
 * @date : 2019/03/22
 */
public class ManFactory {
    public static final int MAN_TYPE_YELLOW = 1;
    public static final int MAN_TYPE_WHITE = 2;

    public IMan getMan(int type) {
        IMan man = null;
        switch (type) {
            case MAN_TYPE_WHITE:
                man = new WhiteMan();
                break;
            case MAN_TYPE_YELLOW:
                man = new YellowMan();
                break;
            default:
        }
        return man;
    }

//    public IMan getMan(Class clazz){
//        IMan man = null;
//
//
//
//
//
//    }
}

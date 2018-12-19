package com.update.pattern.structural.decorator.v1;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}

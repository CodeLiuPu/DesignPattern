package com.update.pattern.structural.decorator.v2;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class Battercake extends ABattercake{
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}

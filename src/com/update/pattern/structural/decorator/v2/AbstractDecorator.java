package com.update.pattern.structural.decorator.v2;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class AbstractDecorator  extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }
    @Override
    public String getDesc() {
        return this.aBattercake .getDesc();

    }

    @Override
    public int cost() {
        return this.aBattercake.cost();
    }
}

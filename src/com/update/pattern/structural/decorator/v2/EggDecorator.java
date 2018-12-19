package com.update.pattern.structural.decorator.v2;

/**
 * @author : liupu.
 * @date : 2018/12/19
 */
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}

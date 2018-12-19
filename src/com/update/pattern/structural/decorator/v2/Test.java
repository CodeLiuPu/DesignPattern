package com.update.pattern.structural.decorator.v2;


public class Test {
    public static void main(String[] args) {
        ABattercake battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getDesc() + " " + battercake.cost() + "元");

    }
}

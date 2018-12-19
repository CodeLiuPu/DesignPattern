package com.update.pattern.structural.decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " " + battercake.cost() + "元");

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " " + battercakeWithEgg.cost() + "元");

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " " + battercakeWithEggSausage.cost() + "元");

    }
}

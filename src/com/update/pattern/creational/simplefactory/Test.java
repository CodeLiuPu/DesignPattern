package com.update.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        IMan man = new ManFactory().getMan(ManFactory.MAN_TYPE_YELLOW);
        man.speak();
    }
}

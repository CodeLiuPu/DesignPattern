package com.update.pattern.structural.proxy._static;

/**
 * @author : liupu
 * date   : 2019/6/20
 * desc   :
 */
public class Oversea implements People {
    People people;

    public Oversea(People people) {
        this.people = people;
    }

    @Override
    public void buy() {
        System.out.println("从海外购买");
        people.buy();
    }
}

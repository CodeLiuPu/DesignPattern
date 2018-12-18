package com.update.pattern.structural.staticproxy;

/**
 * @author : liupu.
 * @date : 2018/12/18
 */
public class Oversea implements People {

    People people;
    public Oversea(People people){
        this.people = people;
    }

    @Override
    public void buy() {
        System.out.println("海外代购");
        this.people.buy();
    }
}

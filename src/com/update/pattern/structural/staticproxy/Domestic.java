package com.update.pattern.structural.staticproxy;

/**
 * @author : liupu.
 * @date : 2018/12/18
 */
public class Domestic implements  People{
    @Override
    public void buy() {
        System.out.println("国内要买一个包");
    }
}

package com.update.pattern.structural.adapter.classadapter;

/**
 * @author : liupu.
 * @date : 2019/02/01
 */
public class Test {
    public static void main(String[] args) {
        Electric electric = new PhoneAdapter();
        int power = electric.outputPower();
        System.out.println(power);
    }
}

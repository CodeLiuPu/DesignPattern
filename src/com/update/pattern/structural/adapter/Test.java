package com.update.pattern.structural.adapter;

/**
 * @author : liupu.
 * @date : 2019/01/31
 */
public class Test {
    public static void main(String[] args) {
        Electric electric = new Electric();
        System.out.println(electric.putput_220v());

        Adapter adapter = new PhoneAdapter(electric);
        System.out.println(adapter.convertPower());
    }
}

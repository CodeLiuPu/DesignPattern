package com.update.pattern.structural.adapter.classadapter;

/**
 * @author : liupu.
 * @date : 2019/01/31
 */
public class PhoneAdapter extends Electric implements Adapter {

    @Override
    public int outputPower() {
        return convertPower();
    }

    @Override
    public int convertPower() {
        return 5;
    }
}

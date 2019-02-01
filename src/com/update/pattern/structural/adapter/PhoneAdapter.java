package com.update.pattern.structural.adapter;

/**
 * @author : liupu.
 * @date : 2019/01/31
 */
public class PhoneAdapter implements Adapter{

    private Electric electric;
    public PhoneAdapter(Electric electric){
        this.electric = electric;
    }
    @Override
    public int convertPower() {
        return 5;
    }
}

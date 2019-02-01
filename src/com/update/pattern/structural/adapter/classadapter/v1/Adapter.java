package com.update.pattern.structural.adapter.classadapter.v1;

/**
 * @author : liupu.
 * @date : 2019/02/01
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}

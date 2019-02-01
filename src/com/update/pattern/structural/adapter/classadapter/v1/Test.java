package com.update.pattern.structural.adapter.classadapter.v1;

/**
 * @author : liupu.
 * @date : 2019/02/01
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

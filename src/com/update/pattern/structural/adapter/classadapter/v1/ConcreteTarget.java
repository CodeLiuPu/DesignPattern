package com.update.pattern.structural.adapter.classadapter.v1;

/**
 * @author : liupu.
 * @date : 2019/02/01
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget 的目标方法");
    }
}

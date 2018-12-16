package com.update.pattern.behavior.chainofresponsibility;

/**
 * @author : liupu.
 * @date : 2018/12/16
 */
public abstract class Approver {

    protected Approver approver;

    public void setNext(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}

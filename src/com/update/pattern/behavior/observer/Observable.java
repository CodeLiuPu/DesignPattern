package com.update.pattern.behavior.observer;

/**
 * @author : liupu.
 * @date : 2018/12/16
 */
public interface  Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notify(String message);
}

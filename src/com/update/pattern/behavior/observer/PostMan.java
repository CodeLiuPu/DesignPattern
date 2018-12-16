package com.update.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : liupu.
 * @date : 2018/12/16
 */
public class PostMan implements Observable {
    private List<Observer> list = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(message);
        }
    }
}
